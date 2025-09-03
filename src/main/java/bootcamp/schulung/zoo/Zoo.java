package bootcamp.schulung.zoo;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int totalFoodRequirementInGrams() {
        int  foodRequirementInGrams = 0;
        for (Animal animal : animals) {
            foodRequirementInGrams += animal.species().foodRequirementInGrams();
        }
        return foodRequirementInGrams;
    }
}
