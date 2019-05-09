package com.friend.py.Controller;

import com.friend.py.dao.AccountMapper;
import com.friend.py.dao.DepartmentMapper;
import com.friend.py.dao.TeacherMapper;
import com.friend.py.model.Account;
import com.friend.py.model.Department;
import com.friend.py.model.DepartmentExample;
import com.friend.py.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@Service
public class TeacherController {
    @Autowired private TeacherMapper teacherMapper;
    @Autowired private AccountMapper accountMapper;
    @Autowired private DepartmentMapper departmentMapper;

    @RequestMapping("/AddTeacher")
    private String AddTeacher() {
        return "TeacherRegister";
    }

    @RequestMapping("/DelTeacher")
    @ResponseBody
    public StringBuffer DelTeacher(String number) {
        StringBuffer result = new StringBuffer();
        Account account = accountMapper.selectByPrimaryKey(number);
        Teacher teacher = teacherMapper.selectByPrimaryKey(number);
        System.out.println(number);
        if(account != null) {
            accountMapper.deleteByPrimaryKey(number);
            result.append("{Teacher account deleted.");
        } else {
            result.append("Teacher account not found.");
        }
        if(teacher != null) {
            teacherMapper.deleteByPrimaryKey(number);
            result.append("Teacher record deleted.");
        } else {
            result.append("Teacher record not found.");
        }
        return result;
    }

    @RequestMapping("/TeacherRegister")
    public String TeacherRegister(String number, String name, String gender, String deptNo,
                                  String teaLevel, String teaDscpt, Double salary, String id,
                                  String phone, String password) {
        Account account = accountMapper.selectByPrimaryKey(number);
        Teacher teacher = teacherMapper.selectByPrimaryKey(number);
        if(teacher == null || account == null) {
            account = new Account(number, password, "teacher");
            teacher = new Teacher(number, name, gender, deptNo, teaLevel, teaDscpt, salary, id, phone);
            accountMapper.insert(account);
            teacherMapper.insert(teacher);
            System.out.println("Teacher register succeeded.");
            return "SuccessfullyRegister";
        } else {
            System.out.println("Teacher register failed.");
            return "TeacherRegister";
        }

    }

    @GetMapping("/FindAccount")
    public String FindAccount(String teano) {
//        System.out.println("findaccount");
        System.out.println("findaccount  " + teano);
        return "FindAccount";
    }

//    @RequestMapping("/FindTeacher")
//    public void FindTeacher(String number, HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        String number = (String) session.getAttribute("number");
//        System.out.println(number);
//        Teacher teacher = teacherMapper.selectByPrimaryKey(number);
//        session.setAttribute("selectedTeacher",teacher);
//        return teacher;
//    }
    @RequestMapping("/FindTeacher")
    @ResponseBody
    private Map<String,String> FindTeacher(String number){    //user是与页面参数对应的JavaBean
        //map集合用来存放返回值
        Teacher teacher = teacherMapper.selectByPrimaryKey(number);
        System.out.println("FindTeacher +" + number);
        Map<String,String> map = new HashMap<String, String>();
        if(teacher != null) {
            Department department = departmentMapper.selectByPrimaryKey(teacher.getDeptno());
            map.put("teaname",teacher.getTeaname());
            map.put("gender",teacher.getGender());
            map.put("dept",department.getDeptname());
            map.put("id",teacher.getId());
            map.put("phone",teacher.getPhone());
            System.out.println(map);
        }else {
            map.put("teaname", "");
            map.put("gender", "");
            map.put("dept", "");
            map.put("id", "");
            map.put("phone", "");
        }
        return map;
    }

    @RequestMapping("/UpdateTeacher")
    @ResponseBody
    public StringBuffer UpdateTeacher(String number, String name,
                                      String gender, String deptname,
                                      String id, String phone) {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andDeptnameEqualTo(deptname);
        Teacher teacher = teacherMapper.selectByPrimaryKey(number);
        Department dept = departmentMapper.selectByExample(departmentExample).get(0);
        StringBuffer stringBuffer = new StringBuffer();
        if(teacher != null) {
            teacher.setTeaname(name);
            teacher.setGender(gender);
            teacher.setId(id);
            teacher.setPhone(phone);
            teacher.setDeptno(dept.getDeptno());
            teacherMapper.updateByPrimaryKey(teacher);
            stringBuffer.append("Update Success!");
        } else {
            stringBuffer.append("Update Failed!");
        }
        return stringBuffer;
    }
}
