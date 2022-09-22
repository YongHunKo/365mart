package com.multi.trans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.TransDTO;
import com.multi.service.TransService;

@SpringBootTest
class UpdateTrans {
	@Autowired
	TransService service;

	@Test
	void contextLoads() {
		TransDTO tr = new TransDTO(1, 1, "불가능", null);
		try {
			service.modify(tr);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
