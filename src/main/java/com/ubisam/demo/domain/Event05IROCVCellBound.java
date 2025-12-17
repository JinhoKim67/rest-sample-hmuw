package com.ubisam.demo.domain;

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
