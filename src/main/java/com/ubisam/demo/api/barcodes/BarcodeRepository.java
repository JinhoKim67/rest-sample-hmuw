package com.ubisam.demo.api.barcodes;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.ObjectBarcode;

public interface BarcodeRepository extends JpaRepository<ObjectBarcode, UUID> {
    
}
