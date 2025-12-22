package com.ubisam.demo.domain;

import lombok.Data;

import java.time.Instant;
import java.util.List;

// IR/OCV 공정 Cell 실처리 데이터 보고
@Data
public class Event33EqpIROCVCellProcessingDataReport {

    private String eventId;
    private Long timestamp;
    
    private Integer cellCount;           // 처리 셀 수
    private List<String> cellIds;

    private String lineId;
    private String recipeId;

    private Instant startedAt;           // 공정 시작
    private Instant endedAt;             // 공정 종료

    private Double ambientTempC;         // 주변 온도(있으면)
    private Double fixtureTempC;         // 지그/치구 온도(있으면)
    private Double cellSurfaceTempC;     // 셀 표면 온도(있으면)
    private Integer ocvStabilizeTimeMs;  // OCV 측정 전 안정화 시간
    private Double irTestCurrentA;       // IR 측정 전류(장비 방식에 따라)
    private Integer irPulseWidthMs;      // IR 펄스 폭
    private IrMethod irMethod;           // IR 산출 방식

    private ResultStatus overallStatus;  // OK/NG/PARTIAL_OK
    private String ngReasonCode;         // 전체 NG 사유
    private String ngReason;             // 설명(선택)

    private List<CellIrOcvActual> cellActuals;

    private Boolean isRetest;            // 재측정 여부
    private String calibrationId;        // 계측기 교정/검교정 이력 참조(있으면)
    private String rawDataRef;           // 원본파일/로그 키(CSV, parquet, blob path 등)

    public enum ResultStatus { OK, NG, PARTIAL_OK, ABORTED }

    public enum IrMethod {
        DC_INTERNAL_RESISTANCE,   // DCIR (전류 인가 후 ΔV/ΔI)
        AC_IMPEDANCE,             // AC 임피던스 기반
        PULSE_DV_DI,              // 펄스 기반 일반 표기
        UNKNOWN
    }

    @Data
    public static class CellIrOcvActual {

        private String cellId;            // 셀 S/N
        private Integer channelNo;        // 1..N

        private Instant measuredAt;       // 해당 셀 측정 시각(또는 시작 시각)

        private Double ocvV;              // OCV (V)
        private Double irMohm;            // IR (mΩ)
        private Double irOhm;             // IR (Ω)

        private Double maxTempC;          // 측정 동안의 최대 온도
        private Double minTempC;          // 최소 온도
        private Double contactResistanceMilliOhm; // 접촉저항(측정하는 장비/치구면)
        private Double insulationResistanceMOhm;  // 절연저항

        private Double ocvLowerLimitV;
        private Double ocvUpperLimitV;
        private Double irUpperLimitMohm;  // 
        private Double irLowerLimitMohm;  // 특정 공정

        // Judgement
        private ResultStatus status;      // 셀별 OK/NG
        private String ngCode;            // 셀별 불량 코드
        private String ngMessage;         // 셀별 불량 설명
    }
}