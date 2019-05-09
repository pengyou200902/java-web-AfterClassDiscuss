package com.friend.py.Controller;

import com.friend.py.dao.AccountMapper;
import com.friend.py.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Service
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/ChangePassword")
    public String UpdatePassword(String number) {
//        Account account = accountMapper.selectByPrimaryKey()
        return "ChangePassword";
    }


    @RequestMapping("/UpdatePassword")
    public String UpdatePassword(String oldPassword, String newPassword,
                                 @SessionAttribute("account") Account account) {
        if(oldPassword.equals(account.getPsd())) {
            if(!oldPassword.equals(newPassword)) {
                account.setPsd(newPassword);
                accountMapper.updateByPrimaryKey(account);
                System.out.println("password change success.");
            } else {
                System.out.println("password not changed.");
            }
            return "StudentDashboard";
        } else {
            System.out.println("password change failed.");
            return "ChangePassword";
        }
    }
//    public void printsession(HttpSession session) {
//        String[] names = session.getValueNames();
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ":" + session.getValue(names[i]));
//        }
//    }
}
