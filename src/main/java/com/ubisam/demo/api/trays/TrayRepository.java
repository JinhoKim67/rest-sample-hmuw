package com.ubisam.demo.api.trays;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.ObjectTray;

public interface TrayRepository extends JpaRepository<ObjectTray, UUID> {
    
}
