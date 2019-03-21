package com.jy.design.observer.community;

import com.google.common.eventbus.EventBus;
import com.jy.design.observer.community.teacher.TeacherThree;

/**
 * @author Administrator
 * @ClassName StudentTest
 * @Description TODO
 * @Date 2019/3/21 0021
 * @Version 1.0
 */
public class StudentTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GPCommunity gPCommunity = new GPCommunity();
        eventBus.register(gPCommunity);
        TeacherThree teacherThree = new TeacherThree();
        teacherThree.setContent("Spring中的应用的设计模式！");
        eventBus.post(teacherThree);
    }
}
