package pl.rozekm.yummy.mealapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlServiceTest {

    private final static String GET_CATEGORIES_URL = "https://www.themealdb.com/api/json/v1/1/categories.php";
    private final static String GET_BY_CATEGORY_URL = "https://www.themealdb.com/api/json/v1/1/filter.php?c=SEAFOOD";
    private final static String CATEGORY = "SEAFOOD";

    @Autowired
    private UrlService urlService;

    @Test
    public void shouldCreateGetCategoriesUrl(){

        String url = urlService.createGetCategoriesUrl();

        assertNotNull(url);
        assertEquals(GET_CATEGORIES_URL, url);
    }

    @Test
    public void shouldCreateGetByCategoryUrl(){

        String url = urlService.createGetByCategoryUrl(CATEGORY);

        assertNotNull(url);
        assertEquals(GET_BY_CATEGORY_URL, url);
    }
}
