package com.yikun.lucky.dao.second;

import com.yikun.lucky.entity.TeamModel;
import org.springframework.stereotype.Component;

@Component
public interface ITeamDao {
    int deleteByPrimaryKey(Long id);

    int insert(TeamModel record);

    int insertSelective(TeamModel record);

    TeamModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeamModel record);

    int updateByPrimaryKey(TeamModel record);
}