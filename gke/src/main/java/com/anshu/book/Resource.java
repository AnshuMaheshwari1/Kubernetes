package com.anshu.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class Resource {

		@RequestMapping("/{bookId}")
			public Book hello(@PathVariable("bookId") String bookId) {
						List<Book> bookList = createBookList();
								
								for(Book book : bookList) {
												if (bookId.equals(book.getBookId())) {
																	return book;
																				}
														}
										return new Book();
											}

			private List<Book> createBookList() {
						List<Book> bookList = new ArrayList<Book>();
								
								Book book1 = new Book();
										book1.setAuthor("James Clear1");
												book1.setBookId("1");
														book1.setBookName("Atomic Habits1");
																book1.setPrice("411");
																		bookList.add(book1);
																				
																				Book book2 = new Book();
																						book2.setAuthor("James Clear2");
																								book2.setBookId("2");
																										book2.setBookName("Atomic Habits2");
																												book2.setPrice("412");
																														bookList.add(book2);
																																
																																Book book3 = new Book();
																																		book3.setAuthor("James Clear3");
																																				book3.setBookId("3");
																																						book3.setBookName("Atomic Habits3");
																																								book3.setPrice("413");
																																										bookList.add(book3);
																																												
																																												Book book4 = new Book();
																																														book4.setAuthor("James Clear4");
																																																book4.setBookId("4");
																																																		book4.setBookName("Atomic Habits4");
																																																				book4.setPrice("414");
																																																						bookList.add(book4);
																																																								return bookList;
																																																									}
				
				@RequestMapping("/books")
				    public ResponseEntity<?> getMovies() {
					            return ResponseEntity.ok(createBookList());
						        }
					
					
}

