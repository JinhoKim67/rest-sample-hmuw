package com.ubisam.demo.api.cells;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.ObjectCell;

public interface CellRepository extends JpaRepository<ObjectCell, UUID> {
    
}
