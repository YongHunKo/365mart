package com.multi.trans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.TransDTO;
import com.multi.service.TransService;

@SpringBootTest
class SelectTrans {
	@Autowired
	TransService service;

	@Test
	void contextLoads() {
		TransDTO tr = null;
		try {
			tr = service.get(1);
			System.out.println(tr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
