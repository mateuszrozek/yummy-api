package pl.rozekm.yummy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryApiDto {

    private String idCategory;
    private String strCategory;
    private String strCategoryThumb;
    private String strCategoryDescription;
}
