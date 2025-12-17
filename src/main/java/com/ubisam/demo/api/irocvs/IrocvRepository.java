package com.ubisam.demo.api.irocvs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.ObjectIROCV;

public interface IrocvRepository extends JpaRepository<ObjectIROCV, UUID> {
    
}
