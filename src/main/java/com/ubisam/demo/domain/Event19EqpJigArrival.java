package com.ubisam.demo.domain;

import lombok.Data;

// Jig 도착 보고
@Data
public class Event19EqpJigArrival {

    private String eventId;
    private Long timestamp;

    private ObjectCell ObjectCell;
    private ObjectJig ObjectJig;
}