package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SearchDTO {
	private String gender;
	private String cname;
	private int cateid;
	private String name;
	
//	private String custid;
//	private int itemid;

}
