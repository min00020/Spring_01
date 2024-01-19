package com.yedam.app.board.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	//전체조회
	@GetMapping("boardList")
	public String getBoardList(Model model) {
		List<BoardVO> list = boardService.getBoardAll();
		model.addAttribute("boardList", list);
		return "board/boardList";
	}
	
	//단건조회
	@GetMapping("boardInfo")
	public String getBoardInfo(BoardVO boardVO, Model model) {
		BoardVO findVO = boardService.getBoardInfo(boardVO);
		model.addAttribute("boardInfo",findVO);
		return "board/boardInfo";
	}
	
	//등록 : 빈페이지 요청 / 처리해주는 컨트롤러 2개 필요
	@GetMapping("boardInsert")
	public String boardInsertForm() {
		
		return "board/boardInsert";
	}
	
	@PostMapping("boardInsert")
	public String boardInsertProcess(BoardVO boardVO) {
		boardService.insertBoardInfo(boardVO);
		return "redirect:boardList";
	}

	//수정
	/*
	 * @PostMapping("boardUpdate")
	 * 
	 * @ResponseBody public Map<String, Object> boardUpdate(BoardVO boardVO){ return
	 * boardService.updateBoardInfo(boardVO); }
	 */
	
	@GetMapping("boardUpdate")
	public String boardUpdateFrom(BoardVO boardVO, Model model){
		BoardVO findVO = boardService.getBoardInfo(boardVO);
		model.addAttribute("boardInfo",findVO);
		return "board/boardUpdate";
	}
	
	//수정-처리 : URI -boardUpdate / PARAMETER - BoardVO / RETURN - 수정결과 데이터(Map) > Ajax
	@PostMapping("boardUpdate")
	@ResponseBody
	public Map boardUpdateProcess(@RequestBody BoardVO boardVO, Model model) {
		return boardService.updateBoardInfo(boardVO);
	}
	
	
	//삭제
	//@RequestParam 붙이면 필수값 됨! 데이터 안넘어오면 통신 거부
	@GetMapping("boardDelete")
	public String boardDelete(@RequestParam Integer bno) { 
		boardService.deleteBoardInfo(bno);
		return "redirect:boardList";
	}
	
	
}

	