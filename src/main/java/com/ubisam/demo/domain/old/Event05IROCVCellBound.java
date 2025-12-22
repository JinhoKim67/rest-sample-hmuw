package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectIROCV;

import jakarta.persistence.Id;
import lombok.Data;

// IROCV에 셀 넣기 
@Data
public class Event05IROCVCellBound {
    
    @Id
    private Long timestamp;
    private ObjectIROCV irocvObject;
    private ObjectCell batteryCell;
    private String action;
}
