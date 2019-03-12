package com.jy.design.prototype.issuemodule.entity;

/**
 * @author Administrator
 * @ClassName User
 * @Description 客户
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class User extends Base implements java.io.Serializable{

    private static final long serialVersionUID = 5951296815604629019L;

    private String username;

    private String truename;

    private String password;

    private String meno;

    private String status;

    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", truename='" + truename + '\'' +
                ", password='" + password + '\'' +
                ", meno='" + meno + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
