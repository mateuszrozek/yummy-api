package pl.rozekm.yummy.mealapi;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class MealController {

    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping(value = "/categories", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<CategoryApiDto> getCategories() {
        return mealService.getCategories();
    }

    @GetMapping(value = "/meals/{category}", produces = {"application/json"})
    public @ResponseBody
    List<MealApiDto> getByCategory(@PathVariable String category) {
        return mealService.getByCategory(category);

    }
}
