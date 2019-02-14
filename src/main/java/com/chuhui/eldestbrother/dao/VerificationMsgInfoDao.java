package com.chuhui.eldestbrother.dao;

import com.chuhui.eldestbrother.model.VerificationMsgInfo;

public interface VerificationMsgInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(VerificationMsgInfo record);

    int insertSelective(VerificationMsgInfo record);

    VerificationMsgInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VerificationMsgInfo record);

    int updateByPrimaryKeyWithBLOBs(VerificationMsgInfo record);

    int updateByPrimaryKey(VerificationMsgInfo record);
}