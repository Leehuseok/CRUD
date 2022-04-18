package com.example.test.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.board.model.dao.BoardDao;
import com.example.test.board.model.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDao bDao;
	
	@Override
	public List<BoardVO> BoardList() {
		return bDao.BoardList();
	}

}
