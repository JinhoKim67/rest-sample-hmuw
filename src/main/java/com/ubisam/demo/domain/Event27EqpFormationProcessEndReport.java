package com.ubisam.demo.domain;

import lombok.Data;

// 작업 종료 보고
@Data
public class Event27EqpFormationProcessEndReport {

    private String eventId;
    private Long timestamp;

    private String cellId;    
    private String jigId;
}