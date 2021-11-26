package com.Gaoju.School;

import java.awt.*;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/26 19:17
 * @URL：https://github.com/GaoHaiNB
 */
public class Student {
    private String name;
    private String address;
    private String classes;
    private String id;
    private int score;

    public Student(String name, String address, String classes, String id, int score) {
        this.name = name;
        this.address = address;
        this.classes = classes;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
