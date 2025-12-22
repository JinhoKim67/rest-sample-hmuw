package com.ubisam.demo.domain;

import lombok.Data;

// Cell 이재 작업 시작 Confirm(투입 가능 체크)
@Data
public class Event04HostCellMoveStartAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;

    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }
}