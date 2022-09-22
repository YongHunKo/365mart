package com.multi.refund;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.RefundDTO;
import com.multi.service.RefundService;

@SpringBootTest
class SelectAllRefund {
	@Autowired
	RefundService service;

	@Test
	void contextLoads() {
		List<RefundDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(RefundDTO c:list) {
			System.out.println(c);
		}
	}

}
