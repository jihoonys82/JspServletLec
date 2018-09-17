package board.dao;

import java.util.ArrayList;

import board.dto.BoardDto;
import board.dto.CommentDto;

public interface CommentDao {

	public ArrayList<CommentDto> selectCommentByBoardNo(BoardDto bdto);
	
	public void insertComment(CommentDto dto);
	
	public void deleteComment(CommentDto dto);
	
}
