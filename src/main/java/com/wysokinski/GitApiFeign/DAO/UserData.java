package com.wysokinski.GitApiFeign.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.Data;


import java.util.Date;

@Data
public class UserData {
    @Id
    private int id;
    private String login;
    private String name;
    private String type;
    private int followers;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("public_repos")
    private int publicRepos;
    @JsonProperty("created_at")
    private Date createdAt;
}
