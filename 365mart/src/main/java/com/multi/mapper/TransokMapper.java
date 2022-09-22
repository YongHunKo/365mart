package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.TransokDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface TransokMapper extends MyMapper<String, TransokDTO> {
	public List<TransokDTO> transok(String tran) throws Exception;
}
