package com.yikun.lucky.controller;

import com.yikun.lucky.entity.CommentModel;
import com.yikun.lucky.entity.TeamModel;
import com.yikun.lucky.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {
    @Autowired
    CommonService commonService;
    @RequestMapping("/findComment")
    public String findComment(Long id){
        CommentModel commentModel = commonService.findCommentById(id);
        return  commentModel.toString();
    }

    @RequestMapping("/findDictSub")
    public String findTeamModel(Long id){
        TeamModel teamModel = commonService.findTeamModelById(id);
        return  teamModel.toString();
    }
}
