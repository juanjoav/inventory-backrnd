package com.company.inventory.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseRest extends ResponseRest {

    private CategoryResponse categoryResponse;

    public CategoryResponseRest() {
        this.categoryResponse = new CategoryResponse();
    }

}
    

