package com.company.inventory.dao;

import org.springframework.data.repository.CrudRepository;
import com.company.inventory.models.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {

}
    

