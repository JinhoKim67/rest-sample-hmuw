package com.ubisam.demo.domain;

import lombok.Data;

// Unload 완료보고 응답
@Data
public class Event32HostUnloadCompleteReportAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}