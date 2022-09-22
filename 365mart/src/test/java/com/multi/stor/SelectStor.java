package com.multi.stor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.StorDTO;
import com.multi.service.StorSevice;

@SpringBootTest
class SelectStor {
	@Autowired
	StorSevice service;

	@Test
	void contextLoads() {
		StorDTO st = null;
		try {
			st = service.get(1);
			System.out.println(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
