package com.dev.basketballteamapp.dto;

import lombok.Data;
import java.util.Date;

@Data
public class BaseDto {
    private Long id;
    private String name;
    private Date createDate;
}
