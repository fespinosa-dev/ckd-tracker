package dev.fespinosa.ckdtracker.service.gateway;

import dev.fespinosa.ckdtracker.model.Food;
import dev.fespinosa.ckdtracker.model.Mineral;
import dev.fespinosa.ckdtracker.service.gateway.payload.FoodNutrient;
import dev.fespinosa.ckdtracker.service.gateway.payload.FoodPayload;
import dev.fespinosa.ckdtracker.service.gateway.payload.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServiceGatewayFDC implements FoodServiceGateway {

    private static final String API_KEY = "bGEfiAdLET8knJvNnWqM3gb1xxyCEGBR2Gff6zxN";
    private static final String BASE_URL = "https://api.nal.usda.gov/fdc/v1/foods";

    @Override
    public List<Food> searchBy(String description) {
        Mono<Root> rootMono = WebClient.create(BASE_URL).get()
                .uri(uriBuilder -> uriBuilder.path("/search")
                        .queryParam("query", description)
                        .queryParam("api_key", API_KEY)
                        .queryParam("pageSize", 2).build())
                .retrieve()
                .bodyToMono(Root.class);

        Root block = rootMono.block();
        List<FoodPayload> foods = block.getFoods();
        return foods.stream().map(this::toFood).collect(Collectors.toList());

    }

    private Food toFood(FoodPayload foodPayload) {
        Food food = new Food();
        food.setDescription(foodPayload.getDescription());
        List<Mineral> minerals = foodPayload.getMinerals()
                .stream().map(this::toMineral)
                .collect(Collectors.toList());
        food.setMinerals(minerals);
        return food;

    }

    private Mineral toMineral(FoodNutrient foodNutrient) {
        Mineral mineral = new Mineral();
        mineral.setName(foodNutrient.getNutrientName());
        mineral.setAmount(foodNutrient.getValue());
        mineral.setUnitName(foodNutrient.getUnitName());
        return mineral;
    }

}
