package com.ubisam.demo.domain;

import lombok.Data;

// Cell  이재 작업 완료 with Tray ID
@Data
public class Event07EqpCellMoveComplete {

    private String eventId;
    private Long timestamp;

    private String trayId;

    private Action action; // Load 일경우 Load Event / Unload일 경우 Unload Event
    public enum Action { LOAD, UNLOAD }
}