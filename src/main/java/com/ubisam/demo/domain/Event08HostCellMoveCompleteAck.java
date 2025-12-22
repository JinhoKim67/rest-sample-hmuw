package com.ubisam.demo.domain;

import lombok.Data;

// Cell 이재 작업 완료 Confirm(Tray  배출 가능 체크)
@Data
public class Event08HostCellMoveCompleteAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}