package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Aggregations {
    DataType dataType;
    Nutrients nutrients;

    @JsonProperty("dataType")
    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("nutrients")
    public Nutrients getNutrients() {
        return this.nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
