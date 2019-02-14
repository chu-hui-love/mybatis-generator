package com.chuhui.eldestbrother.model;

import java.util.Date;

public class VerificationMsgInfo {
    /**
     *id
     */
    private Long id;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *12306验证码消息
     */
    private String verificationMsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVerificationMsg() {
        return verificationMsg;
    }

    public void setVerificationMsg(String verificationMsg) {
        this.verificationMsg = verificationMsg;
    }
}