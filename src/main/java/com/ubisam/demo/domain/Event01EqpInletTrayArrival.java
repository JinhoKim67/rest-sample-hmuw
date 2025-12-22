package com.ubisam.demo.domain;

import lombok.Data;

// 장비가 트레이 투입 Port에 도착 Event 보고
@Data
public class Event01EqpInletTrayArrival {

    private String eventId;
    private Long timestamp;

    private ObjectTray objectTray;
    private ObjectProdModel objectProdModel;
    private ObjectRoute objectRoute;
    private short cellCnt;
    private String cellType;
    private ObjectCell objectCell[];
    private ObjectLot objectLot;
    private ObjectUser objectUser;

    private Action action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    public enum Action { IN, OUT }
}