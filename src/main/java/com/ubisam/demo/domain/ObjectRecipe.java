package com.ubisam.demo.domain;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ObjectRecipe {
    @Id
    private UUID id;
    private String recipeId;
    private String name;
    private final ProcessCondition condition;

    public ObjectRecipe(String recipeId, String name, ProcessCondition condition) {
        this.recipeId = recipeId;
        this.name = name;
        this.condition = condition;
    }
    public String name() { return name; }
    public ProcessCondition condition() { return condition; }
}

final class ProcessCondition {
    // 모델/공정별 조건(예: 전류, 전압, 온도, 시간 등)
    public double chargeCurrentA;
    public double chargeVoltageV;
    public double temperatureC;
    public int durationSec;

    public ProcessCondition(double chargeCurrentA, double chargeVoltageV, double temperatureC, int durationSec) {
        this.chargeCurrentA = chargeCurrentA;
        this.chargeVoltageV = chargeVoltageV;
        this.temperatureC = temperatureC;
        this.durationSec = durationSec;
    }
}