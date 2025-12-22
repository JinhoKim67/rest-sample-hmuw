package com.ubisam.demo.domain.old;

import com.ubisam.demo.domain.ObjectBarcode;
import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드 읽기
@Data
public class Event07BarcodeCellReading {
    
    @Id
    private Long timestamp;
    private ObjectBarcode barcodeObject;
    private ObjectCell  batteryCell;
    private String action; 

}
