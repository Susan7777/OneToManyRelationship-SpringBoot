package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.BookCategoryModel;
import com.example.repositories.BookCategoryRepository;

@Service
public class BookCategoryServices {

	@Autowired
	BookCategoryRepository bookCategoryRepository;

	public List<BookCategoryModel> displayData() {
		return bookCategoryRepository.findAll();
	}

	public BookCategoryModel saveData(BookCategoryModel bookcat) {
		return bookCategoryRepository.save(bookcat);
	}

	public BookCategoryModel updateData(Long bookcatid) {
		return bookCategoryRepository.findById(bookcatid).get();
	}

	public void deleteData(BookCategoryModel bookcat) {
		bookCategoryRepository.delete(bookcat);
	}

}
