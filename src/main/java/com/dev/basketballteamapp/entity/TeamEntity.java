package com.dev.basketballteamapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TEAM")
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity extends BaseEntity {

    @Column(name = "LIG", nullable = false)
    private String lig;

    @OneToMany(mappedBy = "team",fetch = FetchType.EAGER)
    private List<PlayerEntity> players;
}
