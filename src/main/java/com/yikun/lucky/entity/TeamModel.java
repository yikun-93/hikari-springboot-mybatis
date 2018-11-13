package com.yikun.lucky.entity;

import java.io.Serializable;
import java.util.Date;

public class TeamModel implements Serializable {
    private Long id;

    private String team_name;

    private Long user_id;

    private Long create_user_id;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public TeamModel(Long id, String team_name, Long user_id, Long create_user_id, Date create_time, Date update_time) {
        this.id = id;
        this.team_name = team_name;
        this.user_id = user_id;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public TeamModel() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name == null ? null : team_name.trim();
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", team_name=").append(team_name);
        sb.append(", user_id=").append(user_id);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}