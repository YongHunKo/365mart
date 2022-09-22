package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.SearchDTO;
import com.multi.frame.MyService;
import com.multi.mapper.SearchMapper;
@Service
public class SearchService implements MyService<String, SearchDTO>{

	@Autowired
	SearchMapper mapper;
	@Override
	public void register(SearchDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(SearchDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public SearchDTO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<SearchDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	
	public List<SearchDTO> searchdb(String gender) throws Exception{
		return mapper.searchdb(gender);
	}
	

}
