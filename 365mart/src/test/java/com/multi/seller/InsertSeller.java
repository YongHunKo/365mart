package com.multi.seller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SellerDTO;
import com.multi.service.SellerService;

@SpringBootTest
class InsertSeller {
	@Autowired
	SellerService service;

	@Test
	void contextLoads() {
		SellerDTO seller = new SellerDTO(1234, "손흥민", "서울 강남구");
		try {
			service.register(seller);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
