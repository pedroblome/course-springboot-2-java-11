package com.pedroblome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroblome.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
