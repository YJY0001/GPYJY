package com.jy.design.prototype.issuemodule;


import com.jy.design.prototype.issuemodule.entity.Issue;
import com.jy.design.prototype.issuemodule.entity.Log;
import com.jy.design.prototype.issuemodule.service.IIssueService;
import com.jy.design.prototype.issuemodule.service.impl.IssueService;
import org.apache.commons.beanutils.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        try{
            IIssueService iIssueService = new IssueService();
            List<Issue> issuelist = new ArrayList<Issue>();
            Issue issue = new Issue();
            issue.setCreateTime(new Date(System.currentTimeMillis()));
            issue.setModifyTime(new Date(System.currentTimeMillis()));
            issue.setCreateUser("admin");
            issue.setCreateUser("admin");
            for(int i=0;i<100;i++){
                Issue issueTmp = new Issue();
                BeanUtils.copyProperties(issueTmp,issue);
                issueTmp.setName(String.valueOf("admin"+i));
                issueTmp.setPrice(Double.valueOf(new Random().nextInt(100) * 100));
                issueTmp.setStock(new Random().nextInt(100));
                issuelist.add(issueTmp);
            }

            //System.out.println(issuelist);

            List<Log> logs = iIssueService.uploadBatch(issuelist);

            System.out.println(logs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
