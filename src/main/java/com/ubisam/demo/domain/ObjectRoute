package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Route {
    @Id
    private UUID id;
    private String routeId;
    private List<RouteStep> steps;
}

public class RouteStep {
    public final String stepCode;
    public final String equipmentType;
}