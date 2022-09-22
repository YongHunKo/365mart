package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.TransDTO;
import com.multi.frame.MyService;
import com.multi.mapper.TransMapper;
@Service
public class TransService implements MyService<Integer, TransDTO>{

	@Autowired
	TransMapper mapper;
	@Override
	public void register(TransDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(TransDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransDTO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<TransDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
