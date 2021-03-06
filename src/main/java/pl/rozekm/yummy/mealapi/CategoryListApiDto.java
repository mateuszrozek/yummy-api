package pl.rozekm.yummy.mealapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class CategoryListApiDto {

    private List<CategoryApiDto> categories;

}
