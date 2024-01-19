package com.yedam.java.book.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService bookService;
	
	//전체조회
	@GetMapping("bookList")
	public String bookList(Model model) {
		List<BookVO> list = bookService.getBookAll();
		model.addAttribute("bookList", list);
		return "book/bookList";
	}
	
	//등록
	@GetMapping("bookInsert")
	public String bookInsertForm() {
		return "book/bookInsert";
	}
	
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		bookService.insertBookInfo(bookVO);
		return "redirect:bookList";
	}
	
	
}
