package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ObjectTray {

    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;
    
}
