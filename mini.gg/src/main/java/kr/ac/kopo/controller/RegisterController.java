package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.vo.MemberVO;

public class RegisterController implements Controller {

    private BoardService boardService;

    public RegisterController() {
        boardService = new BoardService();
    }

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id-name");
        String pwd = request.getParameter("pw-name");
        String name = request.getParameter("name");
        String no = request.getParameter("no");

        // 회원가입을 위한 MemberVO 객체 생성
        MemberVO member = new MemberVO(id, pwd, name, no);

        /*
        // ID 중복 확인
        if (boardService.getMemberById(id) != null) {
            request.setAttribute("errorMessage", "이미 사용 중인 ID입니다.");
            return "/jsp/member/register.jsp"; // 회원가입 페이지로 돌아가기
        }
        */

        try {
            // 회원가입
            boardService.registerMember(member);
        } catch (Exception e) {
            e.printStackTrace(); // 오류 출력
            request.setAttribute("errorMessage", "회원가입 중 오류가 발생했습니다.");
            return "/jsp/member/register.jsp"; // 오류가 발생한 경우
        }

        // 회원가입 성공 시 로그인 페이지로 리다이렉트
        response.sendRedirect("login.do");
        return null; // 리다이렉트 후 null 반환
    }
}