package com.friend.py.Controller;


import com.friend.py.dao.TopicAnswerMapper;
import com.friend.py.dao.TopicMapper;
import com.friend.py.model.Account;
import com.friend.py.model.Topic;
import com.friend.py.model.TopicAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Date;

@Controller
@Service
public class AnswerController {
    @Autowired
    TopicMapper topicMapper;
    @Autowired
    TopicAnswerMapper topicAnswerMapper;

    @RequestMapping("/AddAnswer")
    private String AddAnswer() {
        return "AddAnswer";
    }

    @RequestMapping("/AddAns")
    @ResponseBody
    private StringBuffer AddAns(String ansNo, String topicNo, String content,
                                @SessionAttribute Account account) {
        StringBuffer stringBuffer = new StringBuffer();
        Topic topic = topicMapper.selectByPrimaryKey(topicNo);
        TopicAnswer topicAnswer = topicAnswerMapper.selectByPrimaryKey(ansNo);
        if(topicAnswer == null && topic != null) {
            String lsnNo = topic.getLsnno();
            String teaNo = topic.getTeano();
            topicAnswer = new TopicAnswer(ansNo, lsnNo, topicNo, content, account.getAcc(), new Date());
            topicAnswerMapper.insert(topicAnswer);
            stringBuffer.append("success");
        } else {
            stringBuffer.append("not found topic OR Ans number existed.");
        }
        return stringBuffer;
    }


}
