package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjetBuffer;

import lombok.Data;

// 버퍼에 셀 빼기
@Data
public class Event06BufferCellUnBound {

    private Long timestamp;
    private ObjetBuffer bufferObject;
    private ObjectCell batteryCell;
    private String action;
    
}
