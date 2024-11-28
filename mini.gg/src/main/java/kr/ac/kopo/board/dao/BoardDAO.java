package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;
import kr.ac.kopo.vo.MemberVO;

public interface BoardDAO {

//	List<BoardVO> selectAllBoard() throws Exception;

    MemberVO selectMemberById(MemberVO member) throws Exception; // 회원 정보 조회
    void insertMember(MemberVO member) throws Exception; // 회원가입 메서드 추가
//	List<BoardVO> selectAllBoard() throws Exception;
}