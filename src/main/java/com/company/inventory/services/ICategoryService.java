package com.company.inventory.services;

import org.springframework.http.ResponseEntity;
import com.company.inventory.models.response.CategoryResponseRest;

public interface ICategoryService {
    
    public ResponseEntity<CategoryResponseRest> search();
}
