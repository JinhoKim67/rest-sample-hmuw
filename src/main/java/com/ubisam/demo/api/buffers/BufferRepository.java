package com.ubisam.demo.api.buffers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.util.ObjectBuffer;

public interface BufferRepository extends JpaRepository<ObjectBuffer, UUID> {
    
}
