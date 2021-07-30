package dev.fespinosa.ckdtracker.service.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodSearchCriteria {
    String query;
    String generalSearchInput;
    int pageNumber;
    int numberOfResultsPerPage;
    int pageSize;
    boolean requireAllWords;

    @JsonProperty("query")
    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @JsonProperty("generalSearchInput")
    public String getGeneralSearchInput() {
        return this.generalSearchInput;
    }

    public void setGeneralSearchInput(String generalSearchInput) {
        this.generalSearchInput = generalSearchInput;
    }

    @JsonProperty("pageNumber")
    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("numberOfResultsPerPage")
    public int getNumberOfResultsPerPage() {
        return this.numberOfResultsPerPage;
    }

    public void setNumberOfResultsPerPage(int numberOfResultsPerPage) {
        this.numberOfResultsPerPage = numberOfResultsPerPage;
    }

    @JsonProperty("pageSize")
    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("requireAllWords")
    public boolean getRequireAllWords() {
        return this.requireAllWords;
    }

    public void setRequireAllWords(boolean requireAllWords) {
        this.requireAllWords = requireAllWords;
    }
}
