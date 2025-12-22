package com.ubisam.demo.domain;

import lombok.Data;

// Cell 정보 확인 Confirm
@Data
public class Event06HostCellInfoAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;
    private ObjectCell ObjectCell;

    private ObjectProdModel ObjectProdModel;
    private ObjectRoute ObjectRoute;
    private ObjectLot ObjectLot;

    private AckStatus status;         // OK/NG 등
    private String reason;            // NG에 대한 사유

    public enum AckStatus { OK, NG } 
}