package com.ubisam.demo.domain;

import lombok.Data;

@Data
public class Event09TrayCellUnBound {
    
    private Long timestamp;
    private ObjectTray trayObject;
    private ObjectCell batteryCell;
    private String action;
}
