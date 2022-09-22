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
public class FindrdDTO {
	private String rdno;
	private int rdcnt;
	//rd내부의 변수
	private String custid;
	private String cname;
	private String name;
	private int price;
	//조인으로 얻어온 변수
}
