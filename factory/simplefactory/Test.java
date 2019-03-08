package com.jy.design.factory.simplefactory;

import com.jy.design.factory.simplefactory.entity.Catagory;
import com.jy.design.factory.simplefactory.entity.Issue;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Issue issue = IssueFactory.createIssue(Catagory.TAOBAO);
        System.out.println(issue);
    }
}
