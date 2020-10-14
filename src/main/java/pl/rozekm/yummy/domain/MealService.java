package pl.rozekm.yummy.domain;

import java.util.List;

public interface MealService {
    List<CategoryApiDto> getCategories();

    List<MealApiDto> getByCategory(String category);
}
