package com.ubisam.demo.domain;

import lombok.Data;

// 배출부 이재 작업 완료 컨펌
@Data
public class Event38HostOutletMoveCompleteAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }
}