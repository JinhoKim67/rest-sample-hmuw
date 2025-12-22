package com.ubisam.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Getter @Setter
@NoArgsConstructor
public class ObjectBarcode {

    @Id
    private UUID id;

    private String readerId;     // 예: BCR_INLET_TRAY_01
    private ReaderPosition position;   // INLET / OUTLET
    private ScanTarget target;         // TRAY / CELL
    private String location;           // 예: "Line1/PortA/Left"

    // 어느 포트에 붙어있는지
    private ObjectPort port;

    public enum ReaderPosition { INLET, OUTLET }
    public enum ScanTarget { TRAY, CELL }
}
