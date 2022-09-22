package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.RefundDTO;
import com.multi.frame.MyService;
import com.multi.mapper.RefundMapper;
@Service
public class RefundService implements MyService<Integer, RefundDTO>{

	@Autowired
	RefundMapper mapper;
	@Override
	public void register(RefundDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(RefundDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public RefundDTO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<RefundDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
