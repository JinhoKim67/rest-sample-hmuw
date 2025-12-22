package com.ubisam.demo.domain;

import lombok.Data;

// Cell 이재 작업 시작 with Tray ID
@Data
public class Event03EqpCellMoveStart {

    private String eventId;
    private Long timestamp;
    private ObjectCell ObjectTray;
    private ObjectCell ObjectCell;

    private Action action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    public enum Action { IN, OUT }
}