package com.ubisam.demo.domain;

import lombok.Data;

// Jig 도착보고 응답
@Data
public class Event20HostJigLoadRequestAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}