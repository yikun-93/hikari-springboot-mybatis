package com.yikun.lucky.service.impl;

import com.yikun.lucky.dao.primary.ICommentDao;
import com.yikun.lucky.dao.second.ITeamDao;
import com.yikun.lucky.entity.CommentModel;
import com.yikun.lucky.entity.TeamModel;
import com.yikun.lucky.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private ICommentDao commentDao;
    @Autowired
    private ITeamDao teamDao;

    @Override
    public CommentModel findCommentById(Long id) {
        return  commentDao.selectByPrimaryKey(id);
    }

    @Override
    public TeamModel findTeamModelById(Long id) {
        return teamDao.selectByPrimaryKey(id);
    }
}
