package com.multi.request;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.RequestService;

@SpringBootTest
class DeleteRequest {
	@Autowired
	RequestService service;

	@Test
	void contextLoads() {
		try {
			service.remove(1);
			System.out.println("remove ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
