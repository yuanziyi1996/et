package com.et.pro.video.entity;

import java.time.LocalDateTime;

public class Video {
    String name;
    String subject;
    LocalDateTime createTime;
    String location;
    int id;

    public Video(String name, String subject, LocalDateTime createTime, String location, int id) {
        this.name = name;
        this.subject = subject;
        this.createTime = createTime;
        this.location = location;
        this.id = id;
    }

    public Video(String name, String subject, LocalDateTime createTime, String location) {
        this.name = name;
        this.subject = subject;
        this.createTime = createTime;
        this.location = location;
    }

    public Video() {
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
