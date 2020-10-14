package pl.rozekm.yummy.mealapi;

interface UrlService {
    String createGetCategoriesUrl();

    String createGetByCategoryUrl(String category);
}
