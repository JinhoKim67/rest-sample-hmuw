package com.ubisam.demo.domain;

import lombok.Data;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.*;

@Data
@Entity
public class ObjectLot {
    @Id
    private UUID id;

    // 1) Identification
    private String lotId;

    private String productCode;
    private String productName;
    private String modelCode;
    private String revision;

    // 2) Quantity
    private double qty;
    private Double goodQty;
    private Double ngQty;
    
    // 3) WIP / Routing
    private LotStatus status;
    private String holdReasonCode;
    private String holdReason;

    private String routeId;
    private String currentProcessCode;
    private String currentOperationCode;
    private Integer currentStepSeq;
    private Integer priority;

    // 4) Resource
    private String lineId;
    private String equipmentId;
    private String recipeId;
    private String operatorId;
    private String shift;

    // 5) Time
    private Instant createdAt;
    private Instant releasedAt;
    private Instant startedAt;
    private Instant endedAt;
    private Instant lastMovedAt;
    private Instant expirationAt;

    // 6) Logistics / Location
    private String trayId;
    private String portId;
    private String locationCode;

    // 7) Quality
    private InspectionResult inspectionResult;
    private String qualityGrade;
    private List<String> defectCodes;
    private Map<String, Object> measurementSummary;

    // 8) Extensibility / Audit
    private Map<String, String> attributes; // 공정/고객/설비별 확장
    private String createdBy;
    private String updatedBy;

    public enum LotStatus { WAIT, RUN, HOLD, COMPLETE, SCRAP, SHIP }
    public enum InspectionResult { PASS, FAIL, UNKNOWN }
}