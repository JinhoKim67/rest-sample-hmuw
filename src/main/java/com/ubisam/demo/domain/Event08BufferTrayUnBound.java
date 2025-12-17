package com.ubisam.demo.domain;

import lombok.Data;

@Data
public class Event08BufferTrayUnBound {

    private Long timestamp;
    private ObjetBuffer bufferObject;
    private ObjectTray trayObject;
    private String action;
    
}
