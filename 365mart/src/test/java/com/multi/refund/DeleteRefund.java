package com.multi.refund;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.RefundService;

@SpringBootTest
class DeleteRefund {
	@Autowired
	RefundService service;

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
