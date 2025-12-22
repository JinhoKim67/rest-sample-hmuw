package com.ubisam.demo.domain;

import lombok.Data;

// Load Buffer 이재 완료 Confirm with 가상 Jig ID
@Data
public class Event10HostLoadBufferMoveCompleteAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}