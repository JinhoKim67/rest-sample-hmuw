package com.ubisam.demo.domain;

import lombok.Data;

// Jig Load 요청
@Data
public class Event17EqpJigLoadRequest {

    private String eventId;
    private Long timestamp;
    
    private String cellId;
}