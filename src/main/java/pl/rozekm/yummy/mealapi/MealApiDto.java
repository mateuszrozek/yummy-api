package pl.rozekm.yummy.mealapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MealApiDto {

    private String strMeal;
    private String strMealThumb;
    private String idMeal;
}
