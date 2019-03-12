package com.jy.design.prototype.issuemodule.dao.impl;


import com.jy.design.prototype.issuemodule.entity.Issue;
import com.jy.design.prototype.issuemodule.dao.IIssueDAO;

import java.util.List;

/**
 * @author Administrator
 * @ClassName IssueDAO
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class IssueDAO implements IIssueDAO {

    @Override
    public int insert(Issue issue) {
        System.out.println(issue);
        return 1;
    }
}
