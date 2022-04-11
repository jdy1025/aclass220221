package edu.kh.jdbc.board.model.service;

// import static : static 필드/메서드 호출 시 클래스명 생략
import static edu.kh.jdbc.common.JDBCTemplate.*;
// * 기호 : 모두, 전부(ALL)

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.board.model.dao.BoardDAO;
import edu.kh.jdbc.board.model.vo.Board;
import edu.kh.jdbc.board.model.vo.Reply;

public class BoardService {

	private BoardDAO dao = new BoardDAO();
	
	
	/** 게시글 목록 조회 Service
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectAll() throws Exception{
		// 1) Connection 생성
		Connection conn = getConnection();
		
		// 2) DAO 메서드(SELECT) 호출 후 결과 반환 받기
		List<Board> boardList = dao.selectAll(conn);
		
		// 3) Connection 반환
		close(conn);
		
		// 4) DAO 수행 결과를 View에 반환
		return boardList;
	}


	/** 게시글 상세 조회
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board selectOne(int boardNo) throws Exception{
		// 1) Connection 생성
		Connection conn = getConnection();
		
		// 2) 특정 게시글 상세 조회 DAO 메서드(SELECT) 호출 후 결과 반환 받기
		Board board = dao.selectOne(conn, boardNo);
		
		if(board != null) { // 2)번 게시글 상세 조회 내용이 있을 경우에만
			
			// 3) 특정 게시글의 댓글 목록 조회 DAO 메서드(SELECT) 호출 후 결과 반환 받기
			List<Reply> replyList = dao.selectReplyList(conn, boardNo);
			
			// Board 객체의 replyList 필드에 조회한 댓글 목록을 대입(세팅)
			board.setReplyList(replyList);
		}
		
		
		// 4) Connection 반환
		close(conn);
		
		// 5) DAO 수행 결과 View로 반환
		return board; // 게시글 상세 조회 + 댓글 목록
	}

	
	
	
	
	
	
}
