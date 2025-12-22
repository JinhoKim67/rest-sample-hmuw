package com.ubisam.demo.domain;

import lombok.Data;

// 배출부 Tray  이재 작업 완료
@Data
public class Event37EqpOutletMoveComplete {

    private String eventId;
    private Long timestamp;

    private String trayId;
    private String portId;

    private Action action; // Load 일경우 Load Event / Unload일 경우 Unload Event
    public enum Action { LOAD, UNLOAD }
}