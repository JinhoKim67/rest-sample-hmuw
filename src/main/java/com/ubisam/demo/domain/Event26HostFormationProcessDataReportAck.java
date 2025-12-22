package com.ubisam.demo.domain;

import lombok.Data;

// 작업 데이터 보고 응답
@Data
public class Event26HostFormationProcessDataReportAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}