package com.multi.seller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.SellerService;

@SpringBootTest
class DeleteSeller {
	@Autowired
	SellerService service;

	@Test
	void contextLoads() {
		try {
			service.remove(188);
			System.out.println("remove ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
