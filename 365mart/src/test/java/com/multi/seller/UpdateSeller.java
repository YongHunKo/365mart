package com.multi.seller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SellerDTO;
import com.multi.service.SellerService;

@SpringBootTest
class UpdateSeller {
	@Autowired
	SellerService service;

	@Test
	void contextLoads() {
		SellerDTO seller = new SellerDTO(336, "신용권", "경기 고양시");
		try {
			service.modify(seller);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
