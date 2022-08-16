package com.company.inventory.models.response;

import com.company.inventory.models.Category;

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
    

