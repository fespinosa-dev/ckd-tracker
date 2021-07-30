package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataType {
    int branded;
    int sRLegacy;
    int surveyFNDDS;
    int foundation;

    @JsonProperty("Branded")
    public int getBranded() {
        return this.branded;
    }

    public void setBranded(int branded) {
        this.branded = branded;
    }

    @JsonProperty("SR Legacy")
    public int getSRLegacy() {
        return this.sRLegacy;
    }

    public void setSRLegacy(int sRLegacy) {
        this.sRLegacy = sRLegacy;
    }

    @JsonProperty("Survey (FNDDS)")
    public int getSurveyFNDDS() {
        return this.surveyFNDDS;
    }

    public void setSurveyFNDDS(int surveyFNDDS) {
        this.surveyFNDDS = surveyFNDDS;
    }

    @JsonProperty("Foundation")
    public int getFoundation() {
        return this.foundation;
    }

    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }
}
