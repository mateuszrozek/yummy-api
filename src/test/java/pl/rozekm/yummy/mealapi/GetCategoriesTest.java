package pl.rozekm.yummy.mealapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetCategoriesTest {

    @Autowired
    private MealService mealService;

    @Test
    public void shouldGetCategories(){
        List<CategoryApiDto> categories = mealService.getCategories();

        assertNotNull(categories);
        assertFalse(categories.isEmpty());
    }

}
