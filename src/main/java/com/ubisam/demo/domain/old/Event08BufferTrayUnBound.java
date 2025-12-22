package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectBuffer;

import lombok.Data;

@Data
public class Event08BufferTrayUnBound {

    private Long timestamp;
    private ObjectBuffer bufferObject;
    private ObjectTray trayObject;
    private String action;
    
}
