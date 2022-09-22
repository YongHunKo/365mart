package com.multi.request;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RequestDTO;
import com.multi.service.RequestService;

@SpringBootTest
class SelectRequest {
	@Autowired
	RequestService service;

	@Test
	void contextLoads() {
		RequestDTO request = null;
		try {
			request = service.get(1);
			System.out.println(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
