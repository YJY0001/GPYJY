package com.jy.design.observer.community.teacher;

import com.google.common.eventbus.Subscribe;

/**
 * @author Administrator
 * @ClassName TeacherOne
 * @Description TODO
 * @Date 2019/3/21 0021
 * @Version 1.0
 */
public class TeacherOne {

    private String name;

    private String content;

    public TeacherOne(){}

    public String getName() {
        return "TeacherOne";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TeacherOne{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
