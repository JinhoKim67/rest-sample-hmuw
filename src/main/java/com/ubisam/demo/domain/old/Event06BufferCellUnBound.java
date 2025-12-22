package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectBuffer;

import lombok.Data;

// 버퍼에 셀 빼기
@Data
public class Event06BufferCellUnBound {

    private Long timestamp;
    private ObjectBuffer bufferObject;
    private ObjectCell batteryCell;
    private String action;
    
}
