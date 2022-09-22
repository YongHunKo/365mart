package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.TransokDTO;
import com.multi.frame.MyService;
import com.multi.mapper.TransokMapper;

@Service
public class TransokService implements MyService<String, TransokDTO>{

	@Autowired
	TransokMapper mapper;
	
	@Override
	public void register(TransokDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(TransokDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public TransokDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<TransokDTO> getall() throws Exception {
		return null;
	}
	
	public List<TransokDTO> transok(String tran) throws Exception{
		return mapper.transok(tran);
	}

}
