package dev.fespinosa.ckdtracker.model;

import lombok.Data;

@Data
public class Mineral {
    private String name;
    private MineralShortName shortName;
    private double amount;
    private String unitName;

    public void setName(String name) {
        this.name = name;
    }
}
