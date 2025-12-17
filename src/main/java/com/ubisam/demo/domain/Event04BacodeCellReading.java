package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드가 셸 읽기
@Data
public class Event04BacodeCellReading {

    @Id
    private Long timestamp;
    private ObjectBarcode barcodeObject;
    private ObjectCell batteryCell;
    private String action; 

}
