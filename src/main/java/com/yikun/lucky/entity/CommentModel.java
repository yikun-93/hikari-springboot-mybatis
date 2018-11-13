package com.yikun.lucky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentModel implements Serializable {
    private Long id;

    private String articleId;

    private String content;

    private String fromUid;

    private String uname;

    private String avatar;

    private Date createTime;

    private Date updateTime;

    private String module;

    private Short state;

}