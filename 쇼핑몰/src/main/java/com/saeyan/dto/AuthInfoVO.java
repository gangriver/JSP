package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthInfoVO {
	String userId;
	String userPw;
	String userName;
	String userEmail;
	String grade;

}
