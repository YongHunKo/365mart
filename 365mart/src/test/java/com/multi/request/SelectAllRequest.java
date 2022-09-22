package com.multi.request;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RequestDTO;
import com.multi.service.RequestService;

@SpringBootTest
class SelectAllRequest {
	@Autowired
	RequestService service;

	@Test
	void contextLoads() {
		List<RequestDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(RequestDTO c:list) {
			System.out.println(c);
		}
	}

}
