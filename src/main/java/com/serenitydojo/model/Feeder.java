package com.serenitydojo.model;
import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {
        switch (animal) {

            case CAT:
                return (isPremium) ? SALMON : TUNA;

            case DOG:
                  return (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
            case HAMSTER:
                  return  (isPremium) ? LETTUCE : CABBAGE;
            default:
            return UNKNOWN;

        }
    }
}