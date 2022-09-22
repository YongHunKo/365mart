package com.multi.request;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RequestDTO;
import com.multi.service.RequestService;

@SpringBootTest
class UpdateRequest {
	@Autowired
	RequestService service;

	@Test
	void contextLoads() {
		RequestDTO request = new RequestDTO(2, "def", "신용카드", 0, null);
		try {
			service.modify(request);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
