package dev.fespinosa.ckdtracker.controller;

import dev.fespinosa.ckdtracker.model.Food;
import dev.fespinosa.ckdtracker.service.gateway.FoodServiceGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    private final FoodServiceGateway foodServiceGateway;

    @Autowired
    public FoodController(FoodServiceGateway foodServiceGateway) {
        this.foodServiceGateway = foodServiceGateway;
    }

    @GetMapping
    public ResponseEntity<List<Food>> getFoods(@RequestParam(required = true) String description){
        return ResponseEntity.ok(foodServiceGateway.searchBy(description));
    }
}
