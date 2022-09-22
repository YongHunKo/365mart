package com.multi.stor;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.StorDTO;
import com.multi.service.StorSevice;

@SpringBootTest
class SelectAllStor {
	@Autowired
	StorSevice service;

	@Test
	void contextLoads() {
		List<StorDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(StorDTO c:list) {
			System.out.println(c);
		}
	}

}
