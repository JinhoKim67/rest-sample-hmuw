package com.ubisam.demo.domain;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ObjectRoute {
    @Id
    private UUID id;
    private String routeId;
    private List<String> steps;

    public ObjectRoute(String routeId, List<String> steps) {
        this.routeId = routeId;
        this.steps = List.copyOf(steps);
    }
    public List<String> steps() { return steps; }
}