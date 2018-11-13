package com.yikun.lucky.service;

import com.yikun.lucky.entity.CommentModel;
import com.yikun.lucky.entity.TeamModel;

public interface CommonService {

    CommentModel findCommentById(Long id);

    TeamModel findTeamModelById(Long id);
}
