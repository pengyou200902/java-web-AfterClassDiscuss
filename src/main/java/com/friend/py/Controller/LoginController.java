package com.friend.py.Controller;

import com.friend.py.dao.*;
import com.friend.py.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@Service
public class LoginController {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private TopicMapper topicMapper;
    @Autowired
    private TopicAnswerMapper topicAnswerMapper;
    @Autowired
    private LessonMapper lessonMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/")
    public String checkLogin(@ModelAttribute("signed") String signed) {
        System.out.println("signed == null is " + (signed == null)); //true
//        System.out.println("signed.equals(null) is " + signed.equals(null)); // error

        if(signed == null || signed.equals("0")) {
            return "login";
        }
//        if(signed.equals("0")) {
//            System.out.println(signed);
//            return "login";
//        }
//        System.out.println(signed);
        else if(signed.equals("1")) return "StudentDashboard";
        else    return "login";
//        return "login";
    }

    @RequestMapping("/login")
    public String login(String inputNumber, String inputPassword, String accType, Model model,
                        String signed, HttpServletRequest request){
//        System.out.println("inputNumber == null is " + (inputNumber == null));
//        System.out.println("inputPassword == null is " + (inputPassword == null));
//        System.out.println("signed == null is " + (signed == null));
        String view = "login";
        Account account = accountMapper.selectByPrimaryKey(inputNumber);
        if(inputNumber.equals(account.getAcc()) &&
                inputPassword.equals(account.getPsd()) &&
                account.getAcctype().equals(accType)) {
            Map<String, Object> m = new HashMap<String, Object>();
            HttpSession session = request.getSession();
            signed = new String("1");
            session.setAttribute("signed", signed);
            session.setAttribute("account", account);
            TopicExample topicExample = new TopicExample();
            int all = topicMapper.countByExample(topicExample);
//            topicExample.createCriteria();
            if(account.getAcctype().equals("student"))  {
                topicExample.createCriteria().andAccEqualTo(account.getAcc());
                int my = topicMapper.countByExample(topicExample);
                m.put("my", String.valueOf(my));
                view = "StudentDashboard";
            }
            else if(account.getAcctype().equals("teacher"))  {
                Teacher teacher = teacherMapper.selectByPrimaryKey(account.getAcc());
                String teaName = teacher.getTeaname();
                String dept = departmentMapper.selectByPrimaryKey(teacher.getDeptno()).getDeptname();
                TopicAnswerExample topicAnswerExample = new TopicAnswerExample();
                topicAnswerExample.createCriteria().andAccEqualTo(account.getAcc());
                int myAns = topicAnswerMapper.countByExample(topicAnswerExample);
                topicExample.or().andTeanoEqualTo(account.getAcc());
                int my = topicMapper.countByExample(topicExample);
                topicExample.clear();
                topicExample.or().andTeanoEqualTo(account.getAcc()).andNeedansEqualTo(1);
                int needAns = topicMapper.countByExample(topicExample);
                m.put("my", String.valueOf(my));
                m.put("myAns", String.valueOf(myAns));
                m.put("needAns", String.valueOf(needAns));
                List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                List<Lesson> myLessons = null;
                LessonExample lessonExample = new LessonExample();
                lessonExample.createCriteria().andTeanoEqualTo(account.getAcc());
                myLessons = lessonMapper.selectByExample(lessonExample);
                if(myLessons != null) {
                    for (int i = 0; i < myLessons.size(); i++) {
                        Map<String, Object> map = new HashMap<>();
                        Lesson lesson = myLessons.get(i);
                        map.put("lsnOrder", String.valueOf(i+1));
                        map.put("lsnName", lesson.getLsnname());
                        map.put("teaName", teaName);
                        map.put("dept", dept);
                        map.put("dscpt", lesson.getDscpt());
                        map.put("credit", lesson.getCredits());
                        list.add(map);
                    }
                }
                model.addAttribute("myLessons", list);
                view = "TeacherDashboard";
            }
            else if(account.getAcctype().equals("admin"))  {
                TopicAnswerExample topicAnswerExample = new TopicAnswerExample();
//                topicAnswerExample.createCriteria();
                int allAns = topicAnswerMapper.countByExample(topicAnswerExample);
                m.put("allAns", String.valueOf(allAns));
                view = "AdminDashboard";
            }
            m.put("all", String.valueOf(all));
            model.addAttribute("countMap",m);
        }
        return view;
    }

    @RequestMapping("/Dashboard")
    private String Dashboard(@SessionAttribute("signed") String signed,
                             @SessionAttribute Account account, Model model,
                             HttpServletRequest request) {
        System.out.println("Dashboard"+signed);
        System.out.println("Dashboard"+account.getAcctype());
        if(signed.equals("1")) {
            return login(account.getAcc(), account.getPsd(), account.getAcctype(), model, signed, request);
//            if(account.getAcctype().equals("student"))  {
//                return "StudentDashboard";
//            }
//            else if(account.getAcctype().equals("teacher"))  {
//                return "TeacherDashboard";
//            }
//            else if(account.getAcctype().equals("admin"))  {
//                return "AdminDashboard";
//            }
        }
        return "login";
    }
}
