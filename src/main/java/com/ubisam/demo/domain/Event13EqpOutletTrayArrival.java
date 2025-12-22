package com.ubisam.demo.domain;

import lombok.Data;

// 배출부 Tray 도착 with Tray ID
@Data
public class Event13EqpOutletTrayArrival {

    private String eventId;
    private Long timestamp;
    private ObjectTray ObjectTray;
    private ObjectCell ObjectCell;

    private Action action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    public enum Action { IN, OUT }
}