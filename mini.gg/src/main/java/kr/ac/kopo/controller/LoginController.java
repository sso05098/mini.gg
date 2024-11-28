package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.vo.MemberVO;

public class LoginController implements Controller {

    private BoardService boardService;

    public LoginController() {
        boardService = new BoardService(); // BoardService 인스턴스 생성
    }
    
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
			return "/jsp/member/login.jsp"; // 로그인 페이지로 들어가기
		}
	}
