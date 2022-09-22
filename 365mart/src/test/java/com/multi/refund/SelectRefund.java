package com.multi.refund;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RefundDTO;
import com.multi.service.RefundService;

@SpringBootTest
class SelectRefund {
	@Autowired
	RefundService service;

	@Test
	void contextLoads() {
		RefundDTO rd = null;
		try {
			rd = service.get(1);
			System.out.println(rd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
