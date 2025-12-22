package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectPort;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 포트에 트레이 넣기
@Data
public class Event02PortTrayBound {

    @Id
    private Long timestamp;
    private ObjectTray trayObject;
    private ObjectPort portObject;
    private String action; // Tray에 들어가면 In Event / Tray에서 나오면 Out
    
}