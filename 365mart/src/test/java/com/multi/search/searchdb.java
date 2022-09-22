package com.multi.search;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SearchDTO;
import com.multi.service.SearchService;

@SpringBootTest
class searchdb {
	@Autowired
	SearchService service;

	@Test
	void contextLoads() {
		List<SearchDTO> list = null;
		try {
			list = service.searchdb("남");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(SearchDTO s : list) {
			System.out.println(s);
		}
	}

}
