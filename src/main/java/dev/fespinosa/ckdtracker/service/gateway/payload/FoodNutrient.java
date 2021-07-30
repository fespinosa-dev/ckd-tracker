package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodNutrient {
    int nutrientId;
    String nutrientName;
    String nutrientNumber;
    String unitName;
    String derivationCode;
    String derivationDescription;
    double value;

    @JsonProperty("nutrientId")
    public int getNutrientId() {
        return this.nutrientId;
    }

    public void setNutrientId(int nutrientId) {
        this.nutrientId = nutrientId;
    }

    @JsonProperty("nutrientName")
    public String getNutrientName() {
        return this.nutrientName;
    }

    public void setNutrientName(String nutrientName) {
        this.nutrientName = nutrientName;
    }

    @JsonProperty("nutrientNumber")
    public String getNutrientNumber() {
        return this.nutrientNumber;
    }

    public void setNutrientNumber(String nutrientNumber) {
        this.nutrientNumber = nutrientNumber;
    }

    @JsonProperty("unitName")
    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @JsonProperty("derivationCode")
    public String getDerivationCode() {
        return this.derivationCode;
    }

    public void setDerivationCode(String derivationCode) {
        this.derivationCode = derivationCode;
    }

    @JsonProperty("derivationDescription")
    public String getDerivationDescription() {
        return this.derivationDescription;
    }

    public void setDerivationDescription(String derivationDescription) {
        this.derivationDescription = derivationDescription;
    }

    @JsonProperty("value")
    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
