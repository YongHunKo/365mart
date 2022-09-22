package com.multi.seller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SellerDTO;
import com.multi.service.SellerService;

@SpringBootTest
class SelectAllSeller {
	@Autowired
	SellerService service;

	@Test
	void contextLoads() {
		List<SellerDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(SellerDTO c:list) {
			System.out.println(c);
		}
	}

}
