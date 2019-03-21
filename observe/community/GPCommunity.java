package com.jy.design.observer.community;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.jy.design.observer.community.teacher.TeacherOne;
import com.jy.design.observer.community.teacher.TeacherThree;
import com.jy.design.observer.community.teacher.TeacherTwo;

/**
 * @author Administrator
 * @ClassName GPCommunity
 * @Description 社区类
 * @Date 2019/3/21 0021
 * @Version 1.0
 */
public class GPCommunity {

    @Subscribe
    public void subscribeTeacherOne(TeacherOne teacher){
        System.out.println("老师："+ teacher.getName());
        System.out.println("收到问题");
        System.out.println("问题："+ teacher.getContent());
    }

    @Subscribe
    public void subscribeTeacherTwo(TeacherTwo teacher){
        System.out.println("老师："+ teacher.getName());
        System.out.println("收到问题");
        System.out.println("问题："+ teacher.getContent());
    }

    @Subscribe
    public void subscribeTeacherThree(TeacherThree teacher){
        System.out.println("老师："+ teacher.getName());
        System.out.println("收到问题");
        System.out.println("问题："+ teacher.getContent());
    }
}
