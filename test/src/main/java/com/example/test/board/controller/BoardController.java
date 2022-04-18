package com.example.test.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.board.model.service.BoardService;
import com.example.test.board.model.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	BoardService bService;
	
	@RequestMapping("/")
	String indexPage(Model model) {
		System.out.println("여기 들어왔니??");
		return "index";
	}
	
	@RequestMapping("/boardList")
	public ModelAndView boardList(ModelAndView mv) {
		System.out.println("일단 boardList 입니다!!!");
		List<BoardVO> BoardList = bService.BoardList();

		mv.setViewName("boardList");
		return mv;
	}

}
