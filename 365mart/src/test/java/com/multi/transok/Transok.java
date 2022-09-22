package com.multi.transok;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.TransokDTO;
import com.multi.service.TransokService;

@SpringBootTest
class Transok {
	@Autowired
	TransokService service;

	@Test
	void contextLoads() {
		List<TransokDTO> list = null;
		try {
			list = service.transok("가능");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(TransokDTO t : list) {
			System.out.println(t);
		}
	}

}
