package com.ubisam.demo.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.*;

@Entity
public class ObjectJig {

    @Id
    private UUID id;

    @Column(name = "jig_id", nullable = false, unique = true, length = 64)
    private String jigId;

    @Enumerated(EnumType.STRING)
    @Column(name = "jig_type", nullable = false, length = 32)
    private JigType jigType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loaded_lot_id")
    private ObjectLot loadedLot;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loaded_cell_id")
    private ObjectCell loadedCell;

    @Column(precision = 10, scale = 4)
    private BigDecimal maxVoltage;   // V
    @Column(precision = 10, scale = 4)
    private BigDecimal maxCurrent;   // A
    @Column(precision = 12, scale = 4)
    private BigDecimal maxPower;     // W
    @Column(precision = 10, scale = 4)
    private BigDecimal contactResistanceSpecMilliOhm; // mΩ
    @Column(precision = 12, scale = 4)
    private BigDecimal insulationResistanceSpecMOhm;  // MΩ

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private JigStatus status = JigStatus.AVAILABLE;

    @Column(length = 64)
    private String holdReasonCode;
    @Lob
    private String holdReason;

    public enum JigType { CELL_FORMATION, AGING, IR_TEST, OCV_TEST }
    public enum JigStatus { AVAILABLE, IN_USE, HOLD, MAINTENANCE, SCRAPPED, CALIBRATION_DUE }
}