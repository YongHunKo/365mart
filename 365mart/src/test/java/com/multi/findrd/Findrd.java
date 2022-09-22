package com.multi.findrd;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.FindrdDTO;
import com.multi.service.FindrdService;

@SpringBootTest
class Findrd {
	@Autowired
	FindrdService service;

	@Test
	void contextLoads() {
		List<FindrdDTO> list = null;
		try {
			list = service.findrd("a");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(FindrdDTO r : list) {
			System.out.println(r);
		}
	}

}
