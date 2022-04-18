package com.example.test.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.board.model.vo.BoardVO;

@Mapper
public interface BoardDao {

	List<BoardVO> BoardList();

}
