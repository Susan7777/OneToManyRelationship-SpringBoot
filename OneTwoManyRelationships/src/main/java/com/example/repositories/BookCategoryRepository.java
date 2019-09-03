package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.BookCategoryModel;

public interface BookCategoryRepository extends JpaRepository<BookCategoryModel, Long> {

}
