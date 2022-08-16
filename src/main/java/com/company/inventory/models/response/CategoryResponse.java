package com.company.inventory.models.response;

import java.util.List;

import com.company.inventory.models.Category;
import lombok.Data;

@Data
public class CategoryResponse {

    private List<Category> categories;
    
}
