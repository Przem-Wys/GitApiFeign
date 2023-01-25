package com.wysokinski.GitApiFeign.DTO;

import lombok.*;
import java.util.Date;
@Value
@Builder
public class UserDTO {
     Integer id;
     String login;
     String name;
     String type;
     String avatarUrl;
     Date createdAt;
     Double calculation;
}
