package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ObjectProdModel {
    @Id
    private UUID id;
    private final String modelId;
    private final String name;
    private ObjectRoute route;
}