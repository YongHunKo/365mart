package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.SearchDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface SearchMapper extends MyMapper<String, SearchDTO>{
	public List<SearchDTO> searchdb (String gender) throws Exception;

}
