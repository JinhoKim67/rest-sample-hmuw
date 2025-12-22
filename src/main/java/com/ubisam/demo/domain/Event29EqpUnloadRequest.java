package com.ubisam.demo.domain;

import lombok.Data;

// Unload 요청
@Data
public class Event29EqpUnloadRequest {

    private String eventId;
    private Long timestamp;
    
    private String cellId;
    private String jigId;
}