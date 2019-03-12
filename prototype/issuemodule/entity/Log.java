package com.jy.design.prototype.issuemodule.entity;

/**
 * @author Administrator
 * @ClassName Log
 * @Description 产品上传日志
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Log extends Base{

    private String issueId;

    private String status;

    public Log(){}

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Log{" +
                "issueId='" + issueId + '\'' +
                ", status='" + status + '\'' +
                '}';
     }
}
