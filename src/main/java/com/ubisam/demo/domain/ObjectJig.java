package com.ubisam.demo.domain;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class ObjectJig {

    @Id
    private UUID id;

    private String jigId;                 // 현장 지그 바코드/라벨 ID
    private JigType jigType;              // 예: CELL_FORMATION, AGING, IR_TEST 등

    private ObjectLot loadedLot;
    private ObjectCell loadedCell;

    private Double maxVoltage;            // 정격 최대 전압
    private Double maxCurrent;            // 정격 최대 전류
    private Double maxPower;              // 정격 최대 전력
    private Double contactResistanceSpecMilliOhm;  // 접촉저항 스펙(예)
    private Double insulationResistanceSpecMOhm;   // 절연저항 스펙(예)

    private JigStatus status = JigStatus.AVAILABLE;
    private String holdReasonCode;
    private String holdReason;

    public enum JigType { CELL_FORMATION, AGING, IR_TEST, OCV_TEST }
    public enum JigStatus { AVAILABLE, IN_USE, HOLD, MAINTENANCE, SCRAPPED, CALIBRATION_DUE }
}