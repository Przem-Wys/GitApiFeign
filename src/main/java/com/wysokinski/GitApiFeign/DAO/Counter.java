package com.wysokinski.GitApiFeign.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder

public class Counter {
    @Id
    private String login;
    private int requestCount;
}
