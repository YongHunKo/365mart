package com.multi.trans;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.TransDTO;
import com.multi.service.TransService;

@SpringBootTest
class SelectAllTrans {
	@Autowired
	TransService service;

	@Test
	void contextLoads() {
		List<TransDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(TransDTO c:list) {
			System.out.println(c);
		}
	}

}
