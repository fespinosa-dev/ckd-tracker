package dev.fespinosa.ckdtracker.service;

import dev.fespinosa.ckdtracker.model.Food;
import dev.fespinosa.ckdtracker.service.gateway.FoodServiceGateway;
import dev.fespinosa.ckdtracker.service.gateway.FoodServiceGatewayFDC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class FoodServiceGatewayTest {

    private FoodServiceGateway foodServiceGateway;

    @BeforeEach
    public void setUp(){
        this.foodServiceGateway = new FoodServiceGatewayFDC();
    }

    @Test
    public void testFindAll(){
        List<Food> all = this.foodServiceGateway.searchBy("apple");
        assertThat(all.size()).isEqualTo(2);

    }

}