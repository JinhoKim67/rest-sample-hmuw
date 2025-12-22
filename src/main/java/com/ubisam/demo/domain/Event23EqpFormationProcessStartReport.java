package com.ubisam.demo.domain;

import lombok.Data;

// 작업 시작 보고
@Data
public class Event23EqpFormationProcessStartReport {

    private String eventId;
    private Long timestamp;
    
    private String cellId;    
    private String jigId;
}