package com.ubisam.demo.api.ports;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.ObjectPort;

public interface PortRepository extends JpaRepository<ObjectPort, UUID> {
    
}
