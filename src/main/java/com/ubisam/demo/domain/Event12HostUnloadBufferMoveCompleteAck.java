package com.ubisam.demo.domain;

import lombok.Data;

// Unload Buffer 이재 완료 Confirm 
@Data
public class Event12HostUnloadBufferMoveCompleteAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK / NG 등
    private String reason;            // NG 사유 상세

    public enum AckStatus { OK, NG }   
}