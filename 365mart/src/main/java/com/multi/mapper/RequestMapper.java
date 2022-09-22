package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.RequestDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface RequestMapper extends MyMapper<Integer, RequestDTO>{

}
