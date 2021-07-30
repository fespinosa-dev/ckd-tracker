package dev.fespinosa.ckdtracker.model;

import lombok.Data;

import java.util.List;

@Data
public class Food {
    private String description;
    private int amount;
    private List<Vitamin> vitamins;
    private List<Mineral> minerals;
    private Protein protein;
    private List<Lipid> lipids;
    private List<Carbohydrate> carbohydrates;
    private Nitrogen nitrogen;


}
