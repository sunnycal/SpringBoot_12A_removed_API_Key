package com.example.demo;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String realname;

    private String headshot;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getHeadshot() {
        return headshot;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }
}
