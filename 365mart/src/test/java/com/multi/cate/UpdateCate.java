package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CateDTO;
import com.multi.service.CateService;

@SpringBootTest
class UpdateCate {
	@Autowired
	CateService service;

	@Test
	void contextLoads() {
		CateDTO cate = new CateDTO(62, 60, "장난감");
		try {
			service.modify(cate);
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
