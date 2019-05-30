package com.et.pro.document.entity;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Document implements Serializable{
    String name;
    String subject;
    LocalDateTime createTime;
    String location;
    int id;

    public Document(String name, String subject, LocalDateTime createTime, String location) {
        this.name = name;
        this.subject = subject;
        this.createTime = createTime;
        this.location = location;
    }

    public Document() {
    }

    public Document(String name, String subject, LocalDateTime createTime, String location, int id) {
        this.name = name;
        this.subject = subject;
        this.createTime = createTime;
        this.location = location;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
