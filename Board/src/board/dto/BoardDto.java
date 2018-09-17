package board.dto;

import java.util.Date;

public class BoardDto {
	private int boardNo;
	private String title;
	private String writerId;
	private String writer;
	private String content;
	private int hit;
	private int recommend;
	private Date writtenDate;
	
	@Override
	public String toString() {
		return "boardDto(boardNo="+boardNo + ", title=" + title + ", writerId=" + writerId + ", wirter=" + writer
				+ ", hit=" + hit + ", recommend=" + recommend + ", writtenDate=" + writtenDate + ")";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public Date getWrittenDate() {
		return writtenDate;
	}

	public void setWrittenDate(Date writtenDate) {
		this.writtenDate = writtenDate;
	}
	
	
	
}
