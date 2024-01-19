package com.yedam.java.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	private Integer bookNo;
	private String bookName;
	private String bookCoverimg;
	private Date bookDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Integer bookPrice;
	private String bookPublisher;
	private String bookInfo;
}
