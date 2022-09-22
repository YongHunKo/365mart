package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.FindrdDTO;
import com.multi.frame.MyService;
import com.multi.mapper.FindrdMapper;
@Service
public class FindrdService implements MyService<String, FindrdDTO>{

	@Autowired
	FindrdMapper mapper;
	@Override
	public void register(FindrdDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(FindrdDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public FindrdDTO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<FindrdDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	public List<FindrdDTO> findrd(String rdno) throws Exception{
		return mapper.findrd(rdno);
	}

}
