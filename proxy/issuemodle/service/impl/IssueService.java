package com.jy.design.proxy.issuemodle.service.impl;

import com.jy.design.proxy.issuemodle.entity.Issue;
import com.jy.design.proxy.issuemodle.service.IIssueService;

/**
 * @author Administrator
 * @ClassName IssueService
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class IssueService implements IIssueService {

    @Override
    public void uploadIssue(Issue issue) {
        System.out.println("上传商品！");
    }
}
