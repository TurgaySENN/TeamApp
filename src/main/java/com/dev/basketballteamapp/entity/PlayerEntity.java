package com.dev.basketballteamapp.entity;

import com.dev.basketballteamapp.enums.Positions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PLAYERS")
@NoArgsConstructor
@AllArgsConstructor
public class PlayerEntity extends BaseEntity {

    @Column(name = "SUR_NAME", nullable = true)
    private String surName;

    @Column(name = "POSITION", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Positions position;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private TeamEntity team;
}
