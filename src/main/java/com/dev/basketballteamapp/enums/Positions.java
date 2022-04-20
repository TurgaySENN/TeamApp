package com.dev.basketballteamapp.enums;

import lombok.Getter;

@Getter
public enum Positions {

    POINTGUARD("PG","Point Guard"),
    SHOOTINGGUARD("SG", "Shooting Guard"),
    SMALLFORWARD("SF","Small Forward"),
    POWERFORWARD("PF", "Power forward"),
    CENTER("C", "Center");
    private Positions(String code, String desc){
        this.code=code;
        this.desc=desc;
    }
    private String code;
    private String desc;
}
