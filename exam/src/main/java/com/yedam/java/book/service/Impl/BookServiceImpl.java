package com.yedam.java.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookMapper mapper;

	@Override
	public List<BookVO> getBookAll() {
		return mapper.selectBookList();
	}

	@Override
	public int insertBookInfo(BookVO bookVO) {
		return mapper.insertBook(bookVO);
		
	}
	
	
}
