
		package com.anshu.product;
		
		import org.springframework.beans.factory.annotation.Autowired;	
		import org.springframework.beans.factory.annotation.Qualifier;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RequestMethod;
		import org.springframework.web.bind.annotation.ResponseBody;
		import org.springframework.web.bind.annotation.RestController;
		import org.springframework.web.client.RestTemplate;
		
		@RestController
		@RequestMapping("/book")
		public class Resource {
				
				@Autowired
				 RestTemplate restTemplate;
				
				    @RequestMapping(value = "/all")
				        public Book[] recommendations() {
						        Book[] result = restTemplate.getForObject("http://book-service:6379/book/books", Book[].class);
							        return result;
								    }
		}

