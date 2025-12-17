package com.ubisam.demo.domain;
import jakarta.persistence.Id;
import lombok.Data;

// 버퍼에 트레이 넣기
@Data
public class Event03BufferCellBound {

    @Id
    private Long timestamp;
    private ObjetBuffer bufferObject;
    private ObjectCell  batteryCell;
    private String action; 

}
