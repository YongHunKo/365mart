package com.multi.refund;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RefundDTO;
import com.multi.service.RefundService;

@SpringBootTest
class UpdateRefund {
	@Autowired
	RefundService service;

	@Test
	void contextLoads() {
		RefundDTO rf = new RefundDTO(1,"a","기타");
		try {
			service.modify(rf);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
