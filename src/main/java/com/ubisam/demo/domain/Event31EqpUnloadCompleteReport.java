package com.ubisam.demo.domain;

import lombok.Data;

// Unload 완료보고
@Data
public class Event31EqpUnloadCompleteReport {

    private String eventId;
    private Long timestamp;
    
    private String cellId;
    private String jigId;
}