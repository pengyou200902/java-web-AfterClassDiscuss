package com.friend.py.Controller;

import com.friend.py.dao.DepartmentMapper;
import com.friend.py.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Service
public class DeptController {
    @Autowired  private DepartmentMapper departmentMapper;
    @RequestMapping("/FindDept")
    private String FindDept() {
        return "FindDepartment";
    }

    @RequestMapping("/FindDepartment")
    @ResponseBody
    private Map<String,String> FindDepartment(String number) {
        System.out.println("FindDepartment" + number);
        Map<String,String> map = new HashMap<String, String>();
        Department department = departmentMapper.selectByPrimaryKey(number);
        if(department != null) {
            map.put("result", "Successfully found!");
            map.put("deptName", department.getDeptname());
        } else {
            map.put("result", "Not Found");
        }
        return map;
    }

    @RequestMapping("/UpdateDepartment")
    @ResponseBody
    private StringBuffer UpdateDepartment(String number, String deptName) {
        System.out.println("UpdateDepartment" + number);
        Department department = departmentMapper.selectByPrimaryKey(number);
        StringBuffer stringBuffer = new StringBuffer();
        if(department != null) {
            department.setDeptname(deptName);
            departmentMapper.updateByPrimaryKey(department);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("not found");
        }
        return stringBuffer;
    }

    @RequestMapping("/DelDepartment")
    @ResponseBody
    private StringBuffer DelDepartment(String number) {
        Department department = departmentMapper.selectByPrimaryKey(number);
        StringBuffer stringBuffer = new StringBuffer();
        if(department != null) {
            departmentMapper.deleteByPrimaryKey(number);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("not found");
        }
        return stringBuffer;
    }

    @RequestMapping("/AddDepartment")
    @ResponseBody
    private StringBuffer AddDepartment(String number, String deptName) {
        System.out.println("AddDepartment" + number);
        Department department = departmentMapper.selectByPrimaryKey(number);
        StringBuffer stringBuffer = new StringBuffer();
        if(department != null) {
            stringBuffer.append("Department already existed!");
        } else {
            department = new Department(number, deptName);
            departmentMapper.insert(department);
            stringBuffer.append("success");
        }
        return stringBuffer;
    }
}
