package com.friend.py.Controller;

import com.friend.py.dao.LessonMapper;
import com.friend.py.model.Lesson;
import com.friend.py.model.LessonKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Service
public class LessonController {
    @Autowired private LessonMapper lessonMapper;

    @RequestMapping("/FindLesson")
    private String FindLesson() {
        return "FindLesson";
    }

    @RequestMapping("/FindLsn")
    @ResponseBody
    private Map<String,String> FindLsn(String number, String teano) {
        LessonKey lessonKey = new LessonKey(number, teano);
        Map<String,String> map = new HashMap<String, String>();
        Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
        if(lesson != null) {
            map.put("result", "success");
//            map.put("number", lesson.getLsnno());
            map.put("name", lesson.getLsnname());
            map.put("dscpt", lesson.getDscpt());
            map.put("dept", lesson.getDeptno());
            map.put("credit", lesson.getCredits().toString());
        } else {
            map.put("result", "not found");
        }
        return map;
    }

    @RequestMapping("/UpdateLsn")
    @ResponseBody
    private StringBuffer UpdateLsn(String number, String teano, String name,
                                   String dscpt, String dept, String credit) {
        StringBuffer stringBuffer = new StringBuffer();
        Byte credits = Byte.valueOf(credit);
        LessonKey lessonKey = new LessonKey(number, teano);
        Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
        if(lesson != null) {
            lesson.setLsnname(name);
            lesson.setDscpt(dscpt);
            lesson.setDeptno(dept);
            lesson.setCredits(credits);
            lessonMapper.updateByPrimaryKey(lesson);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("not found");
        }
        return stringBuffer;
    }

    @RequestMapping("/DelLsn")
    @ResponseBody
    private StringBuffer DelLsn(String number, String teano) {
        StringBuffer stringBuffer = new StringBuffer();
        LessonKey lessonKey = new LessonKey(number, teano);
        Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
        if(lesson != null) {
            lessonMapper.deleteByPrimaryKey(lessonKey);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("not found");
        }
        return stringBuffer;
    }

    @RequestMapping("/AddLsn")
    @ResponseBody
    private StringBuffer AddLsn(String number, String name, String teano,
                                   String dscpt, String dept, String credit) {
        StringBuffer stringBuffer = new StringBuffer();
        Byte credits = new Byte(credit);
        LessonKey lessonKey = new LessonKey(number, teano);
        Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
        if(lesson == null) {
            lesson = new Lesson(number, teano, name, dscpt, dept, credits);
            lessonMapper.insert(lesson);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("lesson existed");
        }
        return stringBuffer;
    }
}
