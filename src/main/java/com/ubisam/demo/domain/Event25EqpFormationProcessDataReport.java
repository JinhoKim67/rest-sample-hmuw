package com.ubisam.demo.domain;

import lombok.Data;

// 작업 데이터 보고
@Data
public class Event25EqpFormationProcessDataReport {

    private String cellId;    
    private String jigId;

    private ResultStatus status;

    private Double capacityMah;     // 용량(장비가 제공하면)
    private Double chargeAh;        // 충전 전하량(Ah)
    private Double dischargeAh;     // 방전 전하량(Ah)
    private Double maxTemp;         // 최대 온도
    private Double maxVoltage;    // 최대 전압
    private Double maxCurrent;      // 최대 전류    
 
    public enum ResultStatus { OK, NG, PARTIAL_OK, ABORTED };
}