package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CateService;

@SpringBootTest
class DeleteCate {
	@Autowired
	CateService service;

	@Test
	void contextLoads() {
		try {
			service.remove(14);
			System.out.println("remove ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
