package com.jy.design.proxy.issuemodle;

import com.jy.design.proxy.issuemodle.entity.Issue;
import com.jy.design.proxy.issuemodle.service.IIssueService;
import com.jy.design.proxy.issuemodle.service.impl.IssueService;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ServiceProxy serviceProxy = new ServiceProxy();
        Class<IssueService> issueServiceClass = IssueService.class;
        IIssueService instance = (IIssueService)serviceProxy.getInstance(issueServiceClass);
        Issue issue = new Issue();
        instance.uploadIssue(issue);
    }
}
