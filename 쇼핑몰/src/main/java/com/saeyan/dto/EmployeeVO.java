package com.saeyan.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeVO {
	String empNum;
	String empName;
	String empId;
	String empPw;
	String empPwCon;
	String empAddr;
	String empAddrDetail;
	String empPost;
	String empPhone;
	String empJumin;
	String empEmail;
	Date empEnterDate;

}
