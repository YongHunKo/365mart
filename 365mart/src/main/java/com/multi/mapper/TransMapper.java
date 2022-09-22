package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.TransDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface TransMapper extends MyMapper<Integer, TransDTO>{

}
