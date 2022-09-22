package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.SellerDTO;
import com.multi.frame.MyService;
import com.multi.mapper.SellerMapper;

@Service
public class SellerService implements MyService<Integer, SellerDTO>{

	@Autowired
	SellerMapper mapper;
	
	@Override
	public void register(SellerDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(SellerDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public SellerDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<SellerDTO> getall() throws Exception {
		return mapper.selectall();
	}

}
