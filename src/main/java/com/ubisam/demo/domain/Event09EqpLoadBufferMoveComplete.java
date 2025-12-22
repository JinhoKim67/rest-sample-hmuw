package com.ubisam.demo.domain;

import lombok.Data;

// Load Buffer 이재 완료
@Data
public class Event09EqpLoadBufferMoveComplete {

    private String eventId;
    private Long timestamp;

    private String trayId;

    private Action action; // Load 일경우 Load Event / Unload일 경우 Unload Event
    public enum Action { LOAD, UNLOAD }
}