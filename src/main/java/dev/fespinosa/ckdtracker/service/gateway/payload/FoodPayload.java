package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.fespinosa.ckdtracker.model.MineralShortName;

import java.util.ArrayList;
import java.util.List;

public class FoodPayload {
    int fdcId;
    String description;
    String lowercaseDescription;
    String dataType;
    String gtinUpc;
    String publishedDate;
    String brandOwner;
    String brandName;
    String ingredients;
    String marketCountry;
    String foodCategory;
    String allHighlightFields;
    double score;
    List<FoodNutrient> foodNutrients;

    @JsonProperty("fdcId")
    public int getFdcId() {
        return this.fdcId;
    }

    public void setFdcId(int fdcId) {
        this.fdcId = fdcId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("lowercaseDescription")
    public String getLowercaseDescription() {
        return this.lowercaseDescription;
    }

    public void setLowercaseDescription(String lowercaseDescription) {
        this.lowercaseDescription = lowercaseDescription;
    }

    @JsonProperty("dataType")
    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("gtinUpc")
    public String getGtinUpc() {
        return this.gtinUpc;
    }

    public void setGtinUpc(String gtinUpc) {
        this.gtinUpc = gtinUpc;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("brandOwner")
    public String getBrandOwner() {
        return this.brandOwner;
    }

    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("ingredients")
    public String getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("marketCountry")
    public String getMarketCountry() {
        return this.marketCountry;
    }

    public void setMarketCountry(String marketCountry) {
        this.marketCountry = marketCountry;
    }

    @JsonProperty("foodCategory")
    public String getFoodCategory() {
        return this.foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    @JsonProperty("allHighlightFields")
    public String getAllHighlightFields() {
        return this.allHighlightFields;
    }

    public void setAllHighlightFields(String allHighlightFields) {
        this.allHighlightFields = allHighlightFields;
    }

    @JsonProperty("score")
    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @JsonProperty("foodNutrients")
    public List<FoodNutrient> getFoodNutrients() {
        return this.foodNutrients;
    }

    public void setFoodNutrients(List<FoodNutrient> foodNutrients) {
        this.foodNutrients = foodNutrients;
    }

    public List<FoodNutrient> getMinerals() {
        List<FoodNutrient> foodNutrients = new ArrayList<>();
        //TODO Fetch list from a property file or AWS parameter store
        for (MineralShortName shortName : MineralShortName.values()) {
            getFoodNutrients().stream()
                    .filter(foodNutrient -> foodNutrient.getNutrientName().toLowerCase().contains(shortName.name()
                            .toLowerCase()))
                    .findAny().map(foodNutrients::add);
        }
        return foodNutrients;
    }

}
