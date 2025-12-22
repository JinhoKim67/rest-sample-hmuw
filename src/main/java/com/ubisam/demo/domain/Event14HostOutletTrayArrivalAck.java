package com.ubisam.demo.domain;

import lombok.Data;

// 배출부 Tray 도착 Confirm(공 Tray 여부 체크)
@Data
public class Event14HostOutletTrayArrivalAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    
    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}