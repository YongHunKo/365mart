package com.multi.trans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.TransService;

@SpringBootTest
class DeleteTrans {
	@Autowired
	TransService service;

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
