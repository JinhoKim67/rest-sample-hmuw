package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import lombok.Data;

@Data
public class Event09TrayCellUnBound {
    
    private Long timestamp;
    private ObjectTray trayObject;
    private ObjectCell batteryCell;
    private String action;
}
