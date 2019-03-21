package com.jy.design.observer.community.teacher;

/**
 * @author Administrator
 * @ClassName TeacherOne
 * @Description TODO
 * @Date 2019/3/21 0021
 * @Version 1.0
 */
public class TeacherTwo {
    private String name;

    private String content;

    public TeacherTwo(){}

    public String getName() {
        return "TeacherTwo";
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
