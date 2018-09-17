package board.dao;

import java.util.ArrayList;

import board.dto.BoardDto;
import board.util.Paging;

public interface BoardDao {
	
	/**
	 * get All post list;
	 * @return
	 */
	public ArrayList<BoardDto> getAllList();
	
	/**
	 * get Page List - 페이지 별 리스트 목록
	 * @param startIdx - 해당 페이지의 첫번째 
	 * @param loadCnt - 불러올 목록 수
	 * @return
	 */
	public ArrayList<BoardDto> getPageList(Paging paging);

	/**
	 * get single post - 게시물 1개 가져오기
	 * @param boardNo - 가져올 게시물 번호
	 * @return
	 */
	public BoardDto getPost(int boardNo);
	
	/**
	 * edit Post
	 * @param dto
	 */
	public void editPost(BoardDto dto);
	
	/**
	 * delete Post
	 * @param boardNo
	 */
	public void deletePost(int boardNo);
	
	/**
	 * create new post
	 * @param dto
	 * @return newBoardNo
	 */
	public int createPost(BoardDto dto);
	
	/**
	 * count all board posts
	 * @return
	 */
	public int boardCount();
	
	/**
	 * check recommend is exist in a post.
	 * @param dto
	 * @return
	 */
	public int checkRecommend(BoardDto dto);
	
	/**
	 * increase recommend count 1
	 * @param dto
	 */
	public void insertRecommend(BoardDto dto);
	
	/**
	 * decrease recommend count 1
	 * @param dto
	 */
	public void deleteRecommend(BoardDto dto);
	
	
	public int selectCntAll(String search);
	
	public ArrayList<BoardDto> selectPagingList(Paging paging);
	
}
