package com.ubisam.demo.domain;

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
