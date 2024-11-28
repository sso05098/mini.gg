package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.dao.BoardDAOImpl;
import kr.ac.kopo.vo.BoardVO;
import kr.ac.kopo.vo.MemberVO;

public class BoardService {
	
	private BoardDAO boardDao;
	
	public BoardService() {
		boardDao = new BoardDAOImpl();
	}
	
	public MemberVO getMemberById(MemberVO member) throws Exception {
		return boardDao.selectMemberById(member); // 회원 정보 조회 메서드 추가
	}
	
    public void registerMember(MemberVO member) throws Exception {
        boardDao.insertMember(member); // 회원가입
    }
	
    /*
	public List<BoardVO> searchAllBoard() throws Exception {
	List<BoardVO> boardList = boardDao.selectAllBoard();
		return boardList;
	}
	*/
}
