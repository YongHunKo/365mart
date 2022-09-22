package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.FindrdDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface FindrdMapper extends MyMapper<String, FindrdDTO> {
	public List<FindrdDTO> findrd (String rdno) throws Exception;

}
