package com.ubisam.demo.domain;

import lombok.Data;

// 배출부 Tray 도착
@Data
public class Event35EqpOutletTrayArrival {

    private String eventId;
    private Long timestamp;

    private String trayId;
    private String portId;

    private Action action; // 투입부면 In Event / 배출부면 Out Event
    public enum Action { IN, OUT }
}