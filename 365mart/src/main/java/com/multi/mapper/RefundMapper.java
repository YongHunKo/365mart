package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.RefundDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface RefundMapper extends MyMapper<Integer, RefundDTO>{

}
