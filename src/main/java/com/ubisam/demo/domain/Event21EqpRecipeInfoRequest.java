package com.ubisam.demo.domain;

import lombok.Data;

// Recipe 요청
@Data
public class Event21EqpRecipeInfoRequest {

    private String eventId;
    private Long timestamp;
    
    private ObjectCell ObjectCell;
}