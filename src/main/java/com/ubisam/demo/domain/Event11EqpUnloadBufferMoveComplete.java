package com.ubisam.demo.domain;

import lombok.Data;

import java.util.List;

// Unload Buffer 이재 완료 with 가상 Jig ID
@Data
public class Event11EqpUnloadBufferMoveComplete {

    private String eventId;
    private Long timestamp;

    private Integer cellCount;
    private List<String> cellIds;    // (선택) Cell S/N 리스트 (가능하면 넣는 편이 추적에 유리)
    private ObjectCell ObjectCell[];

    private Action action; // Load 일경우 Load Event / Unload일 경우 Unload Event
    public enum Action { LOAD, UNLOAD }

    private ObjectRecipe recipe;
    private ObjectJig jig;
    private ObjectLot lot;
    private ObjectTray tray;
    private ObjectBuffer toBuffer;

    private ResultStatus status;     // OK / NG
    private String ngReasonCode;     // NG 사유 코드
    private String ngReason;         // NG 사유 상세

    public enum ResultStatus { OK, NG }
}
