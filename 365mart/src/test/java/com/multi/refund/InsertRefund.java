package com.multi.refund;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RefundDTO;
import com.multi.service.RefundService;

@SpringBootTest
class InsertRefund {
	@Autowired
	RefundService service;

	@Test
	void contextLoads() {
		RefundDTO rd = new RefundDTO(1,"a","단순변심");
		try {
			service.register(rd);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
