package com.ubisam.demo.domain;

import lombok.Data;

// Host가 트레이 투입 Port에 도착 Event 보고 확인
@Data
public class Event02HostInletTrayArrivalAck {

    @Id
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}