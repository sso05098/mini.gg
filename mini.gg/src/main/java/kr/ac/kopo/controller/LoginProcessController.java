package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.vo.MemberVO;

public class LoginProcessController implements Controller {

	private BoardService boardService;

    public LoginProcessController() {
        boardService = new BoardService(); // BoardService 인스턴스 생성
    }
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id-name");
		String pwd = request.getParameter("pw-name");
		
		if (id == null || pwd == null) {
		    throw new IllegalArgumentException("ID와 비밀번호는 null일 수 없습니다.");
		}
		
		MemberVO member = boardService.getMemberById(new MemberVO(id));
			
		// 비밀번호 확인
		if (member != null && member.getPwd().equals(pwd)) {
			// 로그인 성공 시 세션에 사용자 정보 저장
			request.getSession().setAttribute("user", member);
			// 메인 화면으로 리다이렉트
			response.sendRedirect("index.jsp");
			return null; // 리다이렉트 후 null 반환
		} else {
			// 로그인 실패 시 알림 메세지 설정
			request.setAttribute("errorMessage", "잘못된 아이디 또는 비밀번호입니다.");
		return "/index.jsp";
	}

}
}
