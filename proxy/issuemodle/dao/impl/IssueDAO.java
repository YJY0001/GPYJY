package com.jy.design.proxy.issuemodle.dao.impl;

import com.jy.design.proxy.issuemodle.dao.IIssueDAO;
import com.jy.design.proxy.issuemodle.entity.Issue;

/**
 * @author Administrator
 * @ClassName IssueDAO
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class IssueDAO implements IIssueDAO {

    @Override
    public void uploadIssue(Issue issue) {
        System.out.println("上传商品:"+issue.toString());
    }
}
