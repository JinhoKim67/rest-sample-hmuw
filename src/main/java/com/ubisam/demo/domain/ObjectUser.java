package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ObjectUser {

    @Id
    private UUID id;
    private String userName;
    private String password;
    
}