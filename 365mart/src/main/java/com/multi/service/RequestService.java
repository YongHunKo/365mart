package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.RequestDTO;
import com.multi.frame.MyService;
import com.multi.mapper.RequestMapper;

@Service
public class RequestService implements MyService<Integer, RequestDTO>{

	@Autowired
	RequestMapper mapper;
	
	@Override
	public void register(RequestDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(RequestDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public RequestDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<RequestDTO> getall() throws Exception {
		return mapper.selectall();
	}
	

}
