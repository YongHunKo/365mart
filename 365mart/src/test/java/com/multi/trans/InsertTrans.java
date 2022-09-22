package com.multi.trans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.TransDTO;
import com.multi.service.TransService;

@SpringBootTest
class InsertTrans {
	@Autowired
	TransService service;

	@Test
	void contextLoads() {
		TransDTO tr = new TransDTO(1, 1, "가능", null);
		try {
			service.register(tr);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
