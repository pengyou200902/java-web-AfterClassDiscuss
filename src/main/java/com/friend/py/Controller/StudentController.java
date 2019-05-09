package com.friend.py.Controller;
// Register For Students

import com.friend.py.dao.AccountMapper;
import com.friend.py.dao.StudentMapper;
import com.friend.py.model.Account;
import com.friend.py.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;

//import java.util.List;

@Controller
@Service
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/register")
    private String register(){
        return "register";
    }

    @RequestMapping("/AddStu")
    private String AddStuAcc(String number, String password, String name,
                             String gender, String deptNo, Byte totcredit,
                             String id, String phone){
//        studentMapper = new StudentMapper();
//        System.out.println(number);
//        System.out.println(name);
//        System.out.println(gender);
//        System.out.println(deptNo);
//        System.out.println(id);
//        System.out.println(phone);
        Account account = accountMapper.selectByPrimaryKey(number);
        Student student = studentMapper.selectByPrimaryKey(number);
        if(account == null || student == null) {
            account = new Account(number, password, "student");
            student = student = new Student(number, name, gender, deptNo, new Byte("0"), id, phone);
            accountMapper.insert(account);
            studentMapper.insert(student);
            return "SuccessfullyRegister";
//            JOptionPane.showMessageDialog(null, "Successfully Registered! ",
//                                            "Success", JOptionPane.PLAIN_MESSAGE);
        } else {
            return "NumberExisted";
//            JOptionPane.showMessageDialog(null, "Number already existed!",
//                                            "Failed", JOptionPane.ERROR_MESSAGE);
        }
//        return "login";
    }

    @RequestMapping("/DeleteStu")
    private String DeleteStu(){
        String s = "test";
        return s;
    }

    @RequestMapping("/UpdateStu")
    private String UpdateStu(){
        String s = "test";
        return s;
    }
}
