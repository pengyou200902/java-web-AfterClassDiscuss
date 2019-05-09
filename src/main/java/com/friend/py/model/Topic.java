package com.friend.py.model;

import java.sql.Timestamp;
import java.util.Date;

public class Topic {
    private String topicno;

    private String lsnno;

    private String title;

    private String content;

    private String acc;

    private String teano;

    private Integer needans;

    private Date moment;

    public Topic(String topicno, String lsnno, String title, String content, String acc, String teano, Integer needans, Date moment) {
        this.topicno = topicno;
        this.lsnno = lsnno;
        this.title = title;
        this.content = content;
        this.acc = acc;
        this.teano = teano;
        this.needans = needans;
        this.moment = moment;
    }

    public Topic(String topicno, String lsnno, String title, String content, String acc, String teano, Integer needans, Timestamp moment) {
        this.topicno = topicno;
        this.lsnno = lsnno;
        this.title = title;
        this.content = content;
        this.acc = acc;
        this.teano = teano;
        this.needans = needans;
        this.moment = moment;
    }

    public Topic(String whatsthat, String topicno, String lsnno, String title,
                 String content, String acc, String teano, Integer needans, Timestamp timestamp) {
        System.out.println("top 3 whatsthat is " + whatsthat);
        this.topicno = topicno;
        this.lsnno = lsnno;
        this.title = title;
        this.content = content;
        this.acc = acc;
        this.teano = teano;
        this.needans = needans;
        this.moment = timestamp;
    }
    public String getTopicno() {
        return topicno;
    }

    public void setTopicno(String topicno) {
        this.topicno = topicno == null ? null : topicno.trim();
    }

    public String getLsnno() {
        return lsnno;
    }

    public void setLsnno(String lsnno) {
        this.lsnno = lsnno == null ? null : lsnno.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getTeano() {
        return teano;
    }

    public void setTeano(String teano) {
        this.teano = teano == null ? null : teano.trim();
    }

    public Integer getNeedans() {
        return needans;
    }

    public void setNeedans(Integer needans) {
        this.needans = needans;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
}