package com.ubisam.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Getter @Setter
@NoArgsConstructor
public class ObjectPort {

    @Id
    private UUID id;

    private String portId;      // 예: INLET_01, OUTLET_01
    private PortType portType;  // INLET / OUTLET

    public enum PortType { INLET, OUTLET }
}