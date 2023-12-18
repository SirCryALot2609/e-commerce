package com.example.ecommerce.repository;

import com.example.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByName(String name);
    @Query(
            "select c from Category c where c.name = :name and c.parentCategory.name = :parentCategoryName"
    )
    public Category findByNameAndParentCategory(
            @Param("name") String name,
            @Param("parentCategoryName") String parentCategoryName
    );
}
