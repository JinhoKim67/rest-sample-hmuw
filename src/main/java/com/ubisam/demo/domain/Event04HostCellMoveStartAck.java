package com.ubisam.demo.domain;

import lombok.Data;

// Cell 이재 작업 시작 Confirm(투입 가능 체크)
@Data
public class Event04HostCellMoveStartAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;

    private AckStatus status;         // OK/NG 등
    private Integer responseCode;      // W6040 (예: 0=OK, 그 외 NG 상세)
    private Boolean hostTrouble;       // B0003 (NG면 true 권장)
    private Integer troubleCode;       // W6003 (NG면 필수)
    private String reason;             // 사람이 보는 설명

    public enum AckStatus { OK, NG } 
}