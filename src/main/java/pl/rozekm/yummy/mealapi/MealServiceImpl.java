package pl.rozekm.yummy.mealapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
class MealServiceImpl implements MealService {

    private final RestTemplate restTemplate;

    private final UrlService urlService;

    public MealServiceImpl(RestTemplate restTemplate, UrlService urlService) {
        this.restTemplate = restTemplate;
        this.urlService = urlService;
    }

    @Override
    public List<CategoryApiDto> getCategories() {

        CategoryListApiDto response = restTemplate.getForObject(
                urlService.createGetCategoriesUrl(),
                CategoryListApiDto.class);

        return Optional.ofNullable(response)
                .map(CategoryListApiDto::getCategories)
                .orElse(null);
    }

    @Override
    public List<MealApiDto> getByCategory(String category) {

        MealListApiDto response = restTemplate.getForObject(
                urlService.createGetByCategoryUrl(category),
                MealListApiDto.class);

        return Optional.ofNullable(response)
                .map(MealListApiDto::getMeals)
                .orElse(null);
    }
}
