package board.dto;

import java.util.Date;

public class CommentDto {
	private int commentNo;
	private int boardNo;
	private String userId;
	private String commentWriter;
	private String pw; 
	private String content;
	private Date writtenDate;
	
	@Override
	public String toString() {
		return "CommentDto [commentNo=" + commentNo + ", boardNo=" + boardNo + ", userId=" + userId + ", commentWriter="
				+ commentWriter + ", pw=" + pw + ", content=" + content + ", writtenDate=" + writtenDate + "]";
	}
	
	public String getCommentWriter() {
		return commentWriter;
	}
	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Date wirttenDate) {
		this.writtenDate = wirttenDate;
	}
}
