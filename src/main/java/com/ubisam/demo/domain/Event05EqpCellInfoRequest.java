package com.ubisam.demo.domain;

import lombok.Data;

// Cell  정보 확인 요청 with Cell ID
@Data
public class Event05EqpCellInfoRequest {

    private String eventId;
    private Long timestamp;

    private ObjectCell ObjectCell;
    private ObjectProdModel ObjectProdModel;
    private ObjectRoute ObjectRoute;
    private ObjectLot ObjectLot;
}