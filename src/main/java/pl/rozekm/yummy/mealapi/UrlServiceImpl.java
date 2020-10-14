package pl.rozekm.yummy.mealapi;

import org.springframework.stereotype.Service;

@Service
class UrlServiceImpl implements UrlService {

    public String createGetCategoriesUrl() {
        return "https://www.themealdb.com/api/json/v1/1/categories.php";
    }

    public String createGetByCategoryUrl(String category) {
        return "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + category;
    }
}
