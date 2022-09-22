package com.multi.dto;

import java.util.Date;

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
public class TransokDTO {
//	private String tran;
//	private String custid;
//	private String caddr;
//	private String cname;
//	private String name;		// itemname
//	private int price;
//	private int rdcnt;
	private String rdno;
//	private int stor;
//	private Date ttime;
	
	
	private String cust_id;
	private String cust_name;
	private String cust_addr;
	private String item_name;
	private int item_cnt;
	private int total_price;
	private int stor_cnt;
	private String trans_ok;
	private Date tran_time;

	

}
