package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.SellerDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface SellerMapper extends MyMapper<Integer, SellerDTO> {

}
