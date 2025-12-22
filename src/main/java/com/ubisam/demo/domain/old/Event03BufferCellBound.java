package com.ubisam.demo.domain.old;
import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectBuffer;

import jakarta.persistence.Id;
import lombok.Data;

// 버퍼에 트레이 넣기
@Data
public class Event03BufferCellBound {

    @Id
    private Long timestamp;
    private ObjectBuffer bufferObject;
    private ObjectCell  batteryCell;
    private String action; 

}
