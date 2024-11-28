package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.BoardVO;
import kr.ac.kopo.vo.MemberVO;

public class BoardDAOImpl implements BoardDAO{
	
	private SqlSession sqlSession;
	
	public BoardDAOImpl() {
		sqlSession = new MyConfig().getInstance();
	}
	
	/*
	@Override
	public List<BoardVO> selectAllBoard() throws Exception {
		List<BoardVO> boardList = sqlSession.selectList("dao.BoardDAO.selectAllBoard");
		return boardList;
	}
	*/
	
	
	@Override
	public MemberVO selectMemberById(MemberVO member) throws Exception {
		return sqlSession.selectOne("dao.MemberDAO.selectMemberById", member); // ID로 회원 정보 조회
	}
	
    @Override
    public void insertMember(MemberVO member) throws Exception {
        sqlSession.insert("dao.MemberDAO.insertMember", member); // 회원가입
        sqlSession.commit(); // 트랜잭션 커밋
    }

}
