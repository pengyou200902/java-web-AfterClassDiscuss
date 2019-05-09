package com.friend.py.model;

import java.sql.Timestamp;
import java.util.Date;

public class TopicAnswer {
    private String ansno;

    private String lsnno;

    private String topicno;

    private String content;

    private String acc;

    private Date moment;

    public TopicAnswer(String ansno, String lsnno, String topicno, String content, String acc, Date moment) {
        this.ansno = ansno;
        this.lsnno = lsnno;
        this.topicno = topicno;
        this.content = content;
        this.acc = acc;
        this.moment = moment;
    }

    public TopicAnswer(String ansno, String lsnno, String topicno, String content, String acc, Timestamp moment) {
        this.ansno = ansno;
        this.lsnno = lsnno;
        this.topicno = topicno;
        this.content = content;
        this.acc = acc;
        this.moment = moment;
    }

    public TopicAnswer(String whatsthat, String ansno, String lsnno, String topicno, String content, String acc, Timestamp moment) {
        this.ansno = ansno;
        this.lsnno = lsnno;
        this.topicno = topicno;
        this.content = content;
        this.acc = acc;
        this.moment = moment;
    }

    public String getAnsno() {
        return ansno;
    }

    public void setAnsno(String ansno) {
        this.ansno = ansno == null ? null : ansno.trim();
    }

    public String getLsnno() {
        return lsnno;
    }

    public void setLsnno(String lsnno) {
        this.lsnno = lsnno == null ? null : lsnno.trim();
    }

    public String getTopicno() {
        return topicno;
    }

    public void setTopicno(String topicno) {
        this.topicno = topicno == null ? null : topicno.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc == null ? null : acc.trim();
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
}