package board.service;

import java.util.ArrayList;
import java.util.List;

import board.dao.BoardDao;
import board.dao.BoardDaoImpl;
import board.dao.CommentDao;
import board.dao.CommentDaoImpl;
import board.dto.BoardDto;
import board.dto.CommentDto;
import board.util.Paging;

public class BoardService {
	
	private BoardDto dto;
	private ArrayList<BoardDto> dtos;
	private BoardDao dao = new BoardDaoImpl();
	private CommentDao cdao = new CommentDaoImpl(); 
	
	public ArrayList<BoardDto> getList() {
		return dao.getAllList();
	}
	
	public int getTotal() {
		return dao.boardCount();
	}
	
	public int getTotal(String search) {
		return dao.selectCntAll(search);
	}
	
	public List<BoardDto> getPagingList(Paging paging){
		return dao.getPageList(paging);
	}
	
	public List<BoardDto> selectPagingList(Paging paging) {
		return dao.selectPagingList(paging);
	}
	
	public int write(BoardDto dto) {
		return dao.createPost(dto);
	}
	
	public BoardDto view(int boardNo) {
		return dao.getPost(boardNo);
	}

	public void recommend(BoardDto dto) {
		int count = dao.checkRecommend(dto);
		
		if(count>0) {
			dao.deleteRecommend(dto);
		} else {
			dao.insertRecommend(dto);
		}
	}
	
	public void update(BoardDto dto) {
		dao.editPost(dto);
	}
	
	public void delete(int boardNo) {
		dao.deletePost(boardNo);
	}
	
	public ArrayList<CommentDto> commentList(BoardDto bdto) {
		return cdao.selectCommentByBoardNo(bdto);
	}
}
