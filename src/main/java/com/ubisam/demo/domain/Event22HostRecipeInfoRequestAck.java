package com.ubisam.demo.domain;

import lombok.Data;

// Recipe 요청 응답
@Data
public class Event22HostRecipeInfoRequestAck {
    private String ackId;
    private Long timestamp;

    private String originalEventId;

    private ObjectCell ObjectCell;
    private ObjectRecipe ObjectRecipe;

    private AckStatus status;         // OK/NG 등
    private String reason;            // NG면 이유

    public enum AckStatus { OK, NG }   
}