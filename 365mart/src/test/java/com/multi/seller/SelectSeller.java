package com.multi.seller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SellerDTO;
import com.multi.service.SellerService;

@SpringBootTest
class SelectSeller {
	@Autowired
	SellerService service;

	@Test
	void contextLoads() {
		SellerDTO seller = null;
		try {
			seller = service.get(725);
			System.out.println(seller);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
