package com.ubisam.demo.domain;

import java.time.Instant;
import java.util.UUID;
import lombok.Data;

// 장비가 트레이 투입 Port에 도착 Event 보고
@Data
public class Event01EqpInletTrayArrival {

    private String eventId;
    private Long timestamp;
    private Instant occurredAt;

    private ObjectTray trayObject;
    private ObjectCell batteryCell;

    private Action action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    public enum Action { IN, OUT }
}