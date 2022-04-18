package com.example.test.board.model.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	private int bNo; //PK
	private String bTitle; //제목
	private String bContent; // 내용
	private String bWriter; // 작성자
	private String bFile; // 첨부파일
	private Date bCreateDate; //생성일
	private int viewCnt; // 조회수
	private char bStatus; // 삭제 여부
	public BoardVO() {}
	public BoardVO(int bNo, String bTitle, String bContent, String bWriter, String bFile, Date bCreateDate, int viewCnt,
			char bStatus) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bFile = bFile;
		this.bCreateDate = bCreateDate;
		this.viewCnt = viewCnt;
		this.bStatus = bStatus;
	}
	
	

}
