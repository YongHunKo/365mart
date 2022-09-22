package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.StorDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface StorMapper extends MyMapper<Integer, StorDTO>{

}
