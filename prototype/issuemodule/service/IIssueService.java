package com.jy.design.prototype.issuemodule.service;

import com.jy.design.prototype.issuemodule.entity.Issue;
import com.jy.design.prototype.issuemodule.entity.Log;

import java.util.List;

public interface IIssueService {

    public List<Log> uploadBatch(List<Issue> issuelist);

}
