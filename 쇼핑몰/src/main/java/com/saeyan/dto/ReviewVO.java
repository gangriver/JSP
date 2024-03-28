package com.saeyan.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ReviewVO {
	int reviewNum;
	String productNum;
	String purchaseNum;
	String reviewContent;
	String memberId;
	String productName;
	
	Date reviewDate;


	
}