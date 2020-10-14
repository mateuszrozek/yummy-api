package pl.rozekm.yummy.mealapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class MealServiceImpl implements MealService {

    private final RestTemplate restTemplate;

    public MealServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CategoryApiDto> getCategories() {

        CategoryListApiDto response = restTemplate.getForObject(
                "https://www.themealdb.com/api/json/v1/1/categories.php",
                CategoryListApiDto.class);

        return Optional.ofNullable(response)
                .map(CategoryListApiDto::getCategories)
                .orElse(null);
    }

    @Override
    public List<MealApiDto> getByCategory(String category) {

        MealListApiDto response = restTemplate.getForObject(
                "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + category,
                MealListApiDto.class);

        return Optional.ofNullable(response)
                .map(MealListApiDto::getMeals)
                .orElse(null);
    }
}
