package pl.rozekm.yummy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealApiDto {

    private String strMeal;
    private String strMealThumb;
    private String idMeal;
}
