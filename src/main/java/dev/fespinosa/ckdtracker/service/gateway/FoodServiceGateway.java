package dev.fespinosa.ckdtracker.service.gateway;

import dev.fespinosa.ckdtracker.model.Food;

import java.util.List;

public interface FoodServiceGateway {
    List<Food> searchBy(String description);
}
