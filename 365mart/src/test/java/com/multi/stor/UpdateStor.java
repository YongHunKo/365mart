package com.multi.stor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.StorDTO;
import com.multi.service.StorSevice;

@SpringBootTest
class UpdateStor {
	@Autowired
	StorSevice service;

	@Test
	void contextLoads() {
		StorDTO st = new StorDTO(1, 101, 2000, "A1");
		try {
			service.modify(st);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
