package com.ubisam.demo.domain;

import lombok.Data;

// Jig Load 요청 응답
@Data
public class Event18HostJigLoadRequestAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;

    private ObjectCell ObjectCell;
    private ObjectJig ObjectJig;

    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }
}