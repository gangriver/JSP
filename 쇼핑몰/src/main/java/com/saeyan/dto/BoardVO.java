package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	int boardNum;
	String boardWriter;
	String boardSubject;
	String boardContent;

}
