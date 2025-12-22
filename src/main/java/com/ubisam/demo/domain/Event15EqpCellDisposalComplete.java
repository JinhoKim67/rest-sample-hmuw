package com.ubisam.demo.domain;

import lombok.Data;

// Cell  배출 작업 완료 with Tray ID
@Data
public class Event15EqpCellDisposalComplete {

    private String eventId;
    private Long timestamp;
    
    private ObjectTray ObjectTray;
    private ObjectCell ObjectCell;

    private Action action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    public enum Action { IN, OUT }
}