package com.multi.request;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RequestDTO;
import com.multi.service.RequestService;

@SpringBootTest
class InsertRequest {
	@Autowired
	RequestService service;

	@Test
	void contextLoads() {
		RequestDTO request = new RequestDTO(0, "aaa", "신용카드", 0, null);
		try {
			service.register(request);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
