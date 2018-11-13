package com.yikun.lucky.dao.primary;

import com.yikun.lucky.entity.CommentModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICommentDao {
    int deleteByPrimaryKey(Long id);

    int insert(CommentModel record);

    int insertSelective(CommentModel record);

    CommentModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentModel record);

    int updateByPrimaryKey(CommentModel record);

    List<CommentModel> selectByArticleId(@Param("articleId") String articleId, @Param("offset") int offset, @Param("size") int size);

    int count(String articleId);
}