package com.friend.py.Controller;

import com.friend.py.dao.*;
import com.friend.py.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import java.util.*;

@Controller
@Service
public class QuesController {
    @Autowired
    TopicMapper topicMapper;
    @Autowired
    TopicAnswerMapper topicAnswerMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    LessonMapper lessonMapper;

    @RequestMapping("/ShowQuestion_Stu")
    private String ShowQuestion_Stu(Model model) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("name", "name1");
        m.put("age", "1");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("name", "name2");
        m.put("age", "2");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("name", "name3");
        m.put("age", "3");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("name", "name4");
        m.put("age", "4");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("name", "name5");
        m.put("age", "5");
        list.add(m);
        model.addAttribute("list", list);
        model.addAttribute("test", "tteesstt");
        return "ShowQuestion_Stu";
    }

    @RequestMapping("/ShowMyQues")
    private String ShowMyQues(@SessionAttribute("signed") String signed,
                              @SessionAttribute Account account, Model model) {
        System.out.println("ShowMyQues " + account.getAcc());
        System.out.println("ShowMyQues " + account.getAcctype());
        if (signed.equals("1") && account != null) {
            String acc = account.getAcc();
            String accType = account.getAcctype();
            Map<String, String> map = new HashMap<>();
            List<Map<String, Object>> list = getMyQ(acc, accType, null, null,false);
//            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//            List<Topic> myTopics = null;
//            if (accType.equals("student")) {
//                String questioner = new String("null");
//                Student student = studentMapper.selectByPrimaryKey(acc);
//                questioner = student.getStuname();
//                TopicExample topicExample = new TopicExample();
//                topicExample.createCriteria().andAccEqualTo(acc);
//                myTopics = topicMapper.selectByExample(topicExample);
////                for (Topic myTopic : myTopics) {
//                for (int i = 0; i < myTopics.size(); i++) {
//                    Topic myTopic = myTopics.get(i);
//                    Map<String, Object> m = new HashMap<String, Object>();
//                    LessonKey lessonKey = new LessonKey(myTopic.getLsnno(), myTopic.getTeano());
//                    Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
//                    String teaName = teacherMapper.selectByPrimaryKey(lesson.getTeano()).getTeaname();
//                    String title = myTopic.getTitle();
//                    String content = myTopic.getContent();
//                    String shortContent = new String("null");
//                    String shortTitle = new String("null");
//                    if(title.length() > 10) {
//                        shortTitle = title.substring(0,10)+"...";
//                    } else {shortTitle = title;}
//                    m.put("quesNo", myTopic.getTopicno());
//                    m.put("quesOrder", String.valueOf(i+1));
//                    m.put("lsnName", lesson.getLsnname());
//                    m.put("teaName", teaName);
//                    m.put("shortTitle", shortTitle);
//                    m.put("title", title);
//                    if(content.length() > 10) {
//                        shortContent = content.substring(0,10)+"...";
//                    } else {shortContent = content;}
//                    m.put("shortContent", shortContent);
//                    m.put("content", content);
//                    m.put("time", myTopic.getMoment());
//                    m.put("questioner", questioner);
//                    list.add(m);
//                }
//                model.addAttribute("myTopics", list);
////                System.out.println("model.addAttribute(\"myTopics\", list);");
//            }
//            else if (accType.equals("teacher")) {
//                Teacher teacher = teacherMapper.selectByPrimaryKey(acc);
//
//            }
            model.addAttribute("myTopics", list);
            map.put("acctype",accType);
            map.put("acc",acc);
            map.put("quesQuantity", String.valueOf(list.size()));
//            map.put("quesQuantity", String.valueOf(myTopics.size()));
            model.addAttribute("infoMap", map);
//            System.out.println("model.addAttribute(\"acctype\", accType);");
//            modelMap.addAttribute("acctype",accType);
        }
        return "ShowMyQuestion";
    }

    private List<Map<String, Object>> getAns(String topicNo, String acc, boolean showAll) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<TopicAnswer> answers = null;
        TopicAnswerExample topicAnswerExample = new TopicAnswerExample();
        TopicAnswerExample.Criteria criteria = topicAnswerExample.createCriteria();
        if(topicNo != null){
            criteria.andTopicnoEqualTo(topicNo);
        }
        if(acc != null){
            criteria.andAccEqualTo(acc);
        }
        if(showAll){
            topicAnswerExample.clear();
        }
        topicAnswerExample.or(criteria);
        answers = topicAnswerMapper.selectByExample(topicAnswerExample);
        if(answers.size()>0) {
            for (int i = 0; i < answers.size(); i++) {
                TopicAnswer topicAnswer = answers.get(i);
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("ansNo", topicAnswer.getAnsno());
                map.put("ansOrder", String.valueOf(i+1));
                map.put("teaNo",topicAnswer.getAcc());
                map.put("lsnNo",topicAnswer.getLsnno());
                map.put("ansTime", topicAnswer.getMoment());
                map.put("ansContent",topicAnswer.getContent());
                list.add(map);
            }
        }
        return list;
    }

    private List<Map<String, Object>> getMyQ(String acc, String accType, String topicNo, Integer need, boolean showAll) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<Topic> myTopics = null;
        Student student = null;
        Teacher teacher = null;
        String questioner = new String("null");
        TopicExample topicExample = new TopicExample();
        TopicExample.Criteria criteria = topicExample.createCriteria();

        if(topicNo != null) {
            criteria.andTopicnoEqualTo(topicNo);
        }
        if(need != null) {
            criteria.andNeedansEqualTo(need);
        }

        if (accType.equals("student")) {
            student = studentMapper.selectByPrimaryKey(acc);
//            questioner = student.getStuname();
//            TopicExample topicExample = new TopicExample();
            if(!showAll){
                criteria.andAccEqualTo(acc);
            }
//            myTopics = topicMapper.selectByExample(topicExample);
//            model.addAttribute("myTopics", list);
//                System.out.println("model.addAttribute(\"myTopics\", list);");
        }
        else if (accType.equals("teacher")) {
            teacher = teacherMapper.selectByPrimaryKey(acc);
//            TopicExample topicExample = new TopicExample();
            if(!showAll){
                criteria.andTeanoEqualTo(acc);
            }
//            myTopics = topicMapper.selectByExample(topicExample);
        }
        else if (accType.equals("admin")) { }
        topicExample.or(criteria);
        myTopics = topicMapper.selectByExample(topicExample);
        for (int i = 0; i < myTopics.size(); i++) {
            Topic myTopic = myTopics.get(i);
            Map<String, Object> m = new HashMap<String, Object>();
            if (accType.equals("student")) {
                questioner = student.getStuname();
            } else {
                questioner = studentMapper.selectByPrimaryKey(myTopic.getAcc()).getStuname();
            }
            LessonKey lessonKey = new LessonKey(myTopic.getLsnno(), myTopic.getTeano());
            Lesson lesson = lessonMapper.selectByPrimaryKey(lessonKey);
            String teaName = teacherMapper.selectByPrimaryKey(lesson.getTeano()).getTeaname();
            String title = myTopic.getTitle();
            String content = myTopic.getContent();
            String shortContent = new String("null");
            String shortTitle = new String("null");
            if(title.length() > 10) {
                shortTitle = title.substring(0,10)+"...";
            } else {shortTitle = title;}
            m.put("quesNo", myTopic.getTopicno());
            m.put("quesOrder", String.valueOf(i+1));
            m.put("acc", myTopic.getAcc());
            m.put("lsnName", lesson.getLsnname());
            m.put("teaName", teaName);
            m.put("shortTitle", shortTitle);
            m.put("title", title);
            if(content.length() > 10) {
                shortContent = content.substring(0,10)+"...";
            } else {shortContent = content;}
            m.put("shortContent", shortContent);
            m.put("content", content);
            m.put("time", myTopic.getMoment());
            m.put("questioner", questioner);
            list.add(m);
        }
        return list;
    }

//    private List<Map<String, Map<String, Object>>> getAns(String[] topicNos) {
//        if(topicNos.length <= 0)    return null;
//        List<Map<String, Map<String, Object>>> list = new ArrayList<Map<String, Map<String, Object>>>();
//        for (String topicNo: topicNos) {
//            Map<String, Map<String, Object>> topMap= new HashMap<String, Map<String, Object>>();
//            TopicAnswerExample topicAnswerExample = new TopicAnswerExample();
//            topicAnswerExample.createCriteria().andTopicnoEqualTo(topicNo);
//            List<TopicAnswer> topicAnswers = topicAnswerMapper.selectByExample(topicAnswerExample);
//            if(topicAnswers == null || topicAnswers.size() <= 0)    topMap.put(topicNo,null);
//            for (int i = 0; i < ; i++) {
//                Map<String, Object> map = new HashMap<String, Object>();
//                TopicAnswer topicAnswer = topicAnswers.get(i);
//                map.put("ansNo", topicAnswer.getAnsno());
//                map.put("topicNo", topicAnswer.getTopicno());
//                map.put("ansContent", topicAnswer.getContent());
//                map.put("ansTime", topicAnswer.getMoment());
//                topMap.put(topicNo, map);
//            }
//            list.add(topMap);
//        }
//        return list;
//    }

//    @RequestMapping("/ShowMyQuestion")
//    @ResponseBody
//    private String ShowMyQuestion(@SessionAttribute("signed") String signed, Model model,
//                                  @SessionAttribute Account account, ModelMap modelMap) {
//        System.out.println(account.getAcc());
//        System.out.println(account.getAcctype());
//        if(signed.equals("1") && account != null) {
//            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//            String acc = account.getAcc();
//            String accType = account.getAcctype();
//
//            if(accType.equals("student")) {
//                String questioner = new String();
//                Student student = studentMapper.selectByPrimaryKey(acc);
//                questioner = student.getStuname();
//                TopicExample topicExample = new TopicExample();
//                topicExample.createCriteria().andAccEqualTo(acc);
//                List<Topic> myTopics = topicMapper.selectByExample(topicExample);
//                for(Topic myTopic: myTopics){
//                    Map<String, Object> m = new HashMap<String, Object>();
//                    m.put("title", myTopic.getTitle());
//                    m.put("content", myTopic.getContent());
//                    m.put("time", myTopic.getMoment());
//                    m.put("questioner", questioner);
//                    list.add(m);
//                }
//                model.addAttribute("myTopics",list);
//            }
//            else if(accType.equals("teacher")) {
//                Teacher teacher = teacherMapper.selectByPrimaryKey(acc);
//
//            }
////            model.addAttribute("acctype",accType);
//            modelMap.addAttribute("acctype",accType);
//            return accType;
//        }
//        return null;
//    }

    @RequestMapping("/ShowQuestion_Tea")
    private String ShowQuestion_Tea() {
        return "ShowQuestion_Tea";
    }

    @RequestMapping("/ShowAllQuestion")
    private String ShowAllQuestion(@SessionAttribute("signed") String signed,
                                   @SessionAttribute Account account, Model model) {
        System.out.println("ShowAllQuestion " + account.getAcc());
        System.out.println("ShowAllQuestion " + account.getAcctype());
        if (signed.equals("1") && account != null) {
            String acc = account.getAcc();
            String accType = account.getAcctype();
            Map<String, String> map = new HashMap<>();
            List<Map<String, Object>> list = getMyQ(acc, accType, null, null,true);
            map.put("acctype",accType);
            map.put("acc",acc);
            map.put("quesQuantity", String.valueOf(list.size()));
//            map.put("quesQuantity", String.valueOf(allTopics.size()));
            model.addAttribute("allTopics", list);
            model.addAttribute("infoMap", map);
//            allTopics = topicMapper.selectByExample(topicExample);
//            if (accType.equals("student")) {
//
//            }
            return "ShowAllQuestion";
        }
        return "login";
    }

    @RequestMapping("/AddQuestion")
    private String AddQuestion(@SessionAttribute("signed") String signed,
                               @SessionAttribute Account account, Model model) {
        if (signed.equals("1") && account != null) {
//            Map<String, String> map = new HashMap<>();

            return "AddQuestion";
        }
        return "login";
    }

    @RequestMapping("/AddQues")
    @ResponseBody
    private StringBuffer AddQues(String lsnNo, String teaNo, String topicNo,
                                 String title, String content,
                                 @SessionAttribute Account account) {
        StringBuffer stringBuffer = new StringBuffer();
        String acc = account.getAcc();
        Topic topic = topicMapper.selectByPrimaryKey(topicNo);
        Date date = new Date();
        System.out.println(date);
        if(topic == null) {
            topic = new Topic(topicNo, lsnNo, title, content, acc, teaNo, 1, date);
            topicMapper.insert(topic);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("topic number existed");
        }
        return stringBuffer;
    }

    @RequestMapping("/DelQues")
    @ResponseBody
    private StringBuffer DelQues(String topicNo) {
        StringBuffer stringBuffer = new StringBuffer();
        topicMapper.deleteByPrimaryKey(topicNo);
        stringBuffer.append("success");
        return stringBuffer;
    }

    @RequestMapping("/SeeAnswers")
    private String SeeAnswers(String quesNo, Model model,
                              @SessionAttribute Account account) {
//        Topic topic = topicMapper.selectByPrimaryKey(quesNo);
        Map<String, String> infoMap = new HashMap<>();
        System.out.println("SeeAnswers"+quesNo);
        String acc = account.getAcc();
        String accType = account.getAcctype();
        List<Map<String, Object>> ansList = getAns(quesNo,null, false);
        List<Map<String, Object>> list = getMyQ(acc, accType, quesNo,null,false);
        infoMap.put("acc", acc);
        infoMap.put("acctype",accType);
        infoMap.put("quesQuantity",String.valueOf(list.size()));
        model.addAttribute("myTopics",list);
        model.addAttribute("answers",ansList);
        model.addAttribute("infoMap",infoMap);
        return "ShowQuesDetail";
    }

    @RequestMapping("/NeedAnswer")
    private String NeedAnswer(@SessionAttribute Account account, Model model) {
        String acc = account.getAcc();
        String accType = account.getAcctype();
        Map<String, String> infoMap = new HashMap<>();
        List<Map<String, Object>> list = getMyQ(acc, accType, null,1,false);
        infoMap.put("acc", acc);
        infoMap.put("acctype",accType);
        infoMap.put("quesQuantity",String.valueOf(list.size()));
        model.addAttribute("myTopics",list);
        model.addAttribute("infoMap",infoMap);
        return "ShowNeedAns";
    }

    @RequestMapping("/ShowMyAns")
    private String ShowMyAns(@SessionAttribute Account account, Model model) {
        String acc = account.getAcc();
        String accType = account.getAcctype();
        Map<String, String> infoMap = new HashMap<>();
        List<Map<String, Object>> ansList = getAns(null, acc, false);
        System.out.println("ShowMyAns "+ansList.size());
        infoMap.put("acc", acc);
        infoMap.put("acctype",accType);
        infoMap.put("quesQuantity",String.valueOf(ansList.size()));
        model.addAttribute("answers", ansList);
        model.addAttribute("infoMap", infoMap);
        return "ShowAnswer";
    }

    @RequestMapping("/ShowAllAns")
    private String ShowAllAns(@SessionAttribute Account account, Model model) {
        String acc = account.getAcc();
        String accType = account.getAcctype();
        Map<String, String> infoMap = new HashMap<>();
        List<Map<String, Object>> ansList = getAns(null, null, true);
        System.out.println("ShowAllAns "+ansList.size());
        infoMap.put("acc", acc);
        infoMap.put("acctype",accType);
        infoMap.put("quesQuantity",String.valueOf(ansList.size()));
        model.addAttribute("answers", ansList);
        model.addAttribute("infoMap", infoMap);
        return "ShowAnswer";
    }

}
