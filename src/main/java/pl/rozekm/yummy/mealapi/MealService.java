package pl.rozekm.yummy.mealapi;

import java.util.List;

interface MealService {
    List<CategoryApiDto> getCategories();

    List<MealApiDto> getByCategory(String category);
}
