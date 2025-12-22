package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjetBuffer;

import lombok.Data;

@Data
public class Event08BufferTrayUnBound {

    private Long timestamp;
    private ObjetBuffer bufferObject;
    private ObjectTray trayObject;
    private String action;
    
}
