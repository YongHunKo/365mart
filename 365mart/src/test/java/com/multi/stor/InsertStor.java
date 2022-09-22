package com.multi.stor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.StorDTO;
import com.multi.service.StorSevice;

@SpringBootTest
class InsertStor {
	@Autowired
	StorSevice service;

	@Test
	void contextLoads() {
		StorDTO st = new StorDTO(1, 101, 1500, "A1");
		try {
			service.register(st);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
