package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    int totalHits;
    int currentPage;
    int totalPages;
    List<Integer> pageList;
    FoodSearchCriteria foodSearchCriteria;
    List<FoodPayload> foodPayloads;
    Aggregations aggregations;

    @JsonProperty("totalHits")
    public int getTotalHits() {
        return this.totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    @JsonProperty("currentPage")
    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("totalPages")
    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("pageList")
    public List<Integer> getPageList() {
        return this.pageList;
    }

    public void setPageList(List<Integer> pageList) {
        this.pageList = pageList;
    }

    @JsonProperty("foodSearchCriteria")
    public FoodSearchCriteria getFoodSearchCriteria() {
        return this.foodSearchCriteria;
    }

    public void setFoodSearchCriteria(FoodSearchCriteria foodSearchCriteria) {
        this.foodSearchCriteria = foodSearchCriteria;
    }

    @JsonProperty("foods")
    public List<FoodPayload> getFoods() {
        return this.foodPayloads;
    }

    public void setFoods(List<FoodPayload> foodPayloads) {
        this.foodPayloads = foodPayloads;
    }

    @JsonProperty("aggregations")
    public Aggregations getAggregations() {
        return this.aggregations;
    }

    public void setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
    }
}
