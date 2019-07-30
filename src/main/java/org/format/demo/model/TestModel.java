package org.format.demo.model;

import java.util.Date;

public class TestModel {

    private int age;

    private Date birth;

    private String name;

    private long times;

    public TestModel(int age, Date birth, String name, long times) {
        this.age = age;
        this.birth = birth;
        this.name = name;
        this.times = times;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }
}
