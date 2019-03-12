package com.jy.design.prototype.issuemodule.service.impl;

import com.jy.design.prototype.issuemodule.dao.IIssueDAO;
import com.jy.design.prototype.issuemodule.dao.impl.IssueDAO;
import com.jy.design.prototype.issuemodule.entity.Issue;
import com.jy.design.prototype.issuemodule.entity.Log;
import com.jy.design.prototype.issuemodule.service.IIssueService;
import org.apache.commons.beanutils.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 * @ClassName IssueService
 * @Description 产品服务层
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class IssueService implements IIssueService {


    private IIssueDAO iIssueDAO;

    public IssueService(){
        this.iIssueDAO = new IssueDAO();

    }

    @Override
    public List<Log> uploadBatch(List<Issue> issuelist) {

        //创建产品日志
        List<Log> listLog = new ArrayList<Log>();
        Log log = new Log();
        log.setCreateTime(new Date(System.currentTimeMillis()));
        log.setModifyTime(new Date(System.currentTimeMillis()));
        log.setCreateUser("admin");
        log.setModifyUser("admin");

        try{
            for (Issue issue : issuelist) {
                int insert = iIssueDAO.insert(issue);
                Log logtmp = new Log();
                //实现克隆
                BeanUtils.copyProperties(logtmp,log);
                logtmp.setIssueId(String.valueOf((new Random().nextInt(1000)) * 1000));
                logtmp.setStatus(String.valueOf(insert));
                listLog.add(logtmp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listLog;
    }
}
