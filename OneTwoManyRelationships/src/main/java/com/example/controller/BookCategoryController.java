package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.models.BookCategoryModel;
import com.example.services.BookCategoryServices;

@Controller
public class BookCategoryController {
	
	@Autowired
	public BookCategoryServices bookCategoryServices;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String addNewBookCategory(Model model) {
		BookCategoryModel bookCategoryModel = new BookCategoryModel();
		model.addAttribute("bookCategoryModel", bookCategoryModel);
		return "new_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveData(@ModelAttribute("bookCategoryModel") BookCategoryModel bookCategoryModel) {
		bookCategoryServices.saveData(bookCategoryModel);
		return "redirect:/";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String showData(Model model) {
		List<BookCategoryModel> bookCategoryModel = bookCategoryServices.displayData();
		model.addAttribute("bookCategoryModel", bookCategoryModel);
		return "index";
	}

}
