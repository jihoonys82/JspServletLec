package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import board.dto.BoardDto;
import board.util.Paging;

public class BoardDaoImpl implements BoardDao {
	
	private Connection conn = DBConn.getConnection();;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	private ArrayList<BoardDto> dtos;
	private BoardDto dto;
	
	@Override
	public ArrayList<BoardDto> getAllList() {
		dtos = new ArrayList<>();
		
		String query = "SELECT * FROM board";
		
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			dtos = new ArrayList<>();
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBoardNo(rs.getInt("boardNo"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setHit(rs.getInt("hit"));
				dto.setRecommend(rs.getInt("recommend"));
				dto.setWrittenDate(rs.getDate("writtenDate"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	@Override
	public ArrayList<BoardDto> getPageList(Paging paging) {
		dtos = new ArrayList<>();
		
		String query 
				= "SELECT * FROM ("
				+ " 	SELECT rownum rnum, B.* FROM (" 
				+ " 		SELECT * FROM board " 
				+ " 		ORDER BY boardNo DESC"
				+ " 	) B"
				+ " 	ORDER BY rnum" 
				+ " ) WHERE rnum between ? AND ?";
		
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, paging.getStartNo());
			ps.setInt(2, paging.getEndNo());
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBoardNo(rs.getInt("boardNo"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setHit(rs.getInt("hit"));
				dto.setRecommend(rs.getInt("recommend"));
				dto.setWrittenDate(rs.getDate("writtenDate"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	@Override
	public BoardDto getPost(int boardNo) {
				
		String beforeQuery = "UPDATE Board SET hit = hit+1"
				+ " WHERE boardNo = ?";
		String query = "SELECT * FROM board"
				+ " WHERE boardNo = ?";
		String query2 = "SELECT COUNT(*) FROM recommend WHERE boardNo = ?";
		try {
			// increase hit
			ps = conn.prepareStatement(beforeQuery);
			ps.setInt(1, boardNo);
			ps.executeUpdate();
			
			// get post
			ps = conn.prepareStatement(query);
			ps.setInt(1, boardNo);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBoardNo(rs.getInt("boardNo"));
				dto.setTitle(rs.getString("title"));
				dto.setWriterId(rs.getString("writerId"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setHit(rs.getInt("hit"));
				dto.setRecommend(rs.getInt("recommend"));
				dto.setWrittenDate(new SimpleDateFormat("yy-MM-dd").parse(rs.getString("writtenDate")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	@Override
	public void editPost(BoardDto dto) {
		String query ="UPDATE board SET title=? , content=? "
				+ " WHERE boardNo=?";

		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setInt(3, dto.getBoardNo());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void deletePost(int boardNo) {
		String query ="DELETE FROM board WHERE boardNo=?";

		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, boardNo);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public int createPost(BoardDto dto) {
				
		String query = "INSERT INTO board ( boardno, title, writerid, writer, content, hit, recommend ) VALUES ("
				+ " board_seq.nextval," // boardNo
				+ " ?," // 1. title
				+ " ?," // 2. writerId
				+ " ?," // 3. writer
				+ " ?," // 4. content
				+ " 0," // hit
				+ " 0" // recommend 
				+ " )"; 
		
//		String afterQuery = "SELECT DISTINCT boardNo FROM board WHERE boardNo=board_seq.currval";
		
		int newBoardNo = 0;
		
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getWriterId());
			ps.setString(3, dto.getWriter());
			ps.setString(4, dto.getContent());
			ps.executeUpdate();
			
//			ps = conn.prepareStatement(afterQuery);
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				newBoardNo = rs.getInt(1);
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return newBoardNo;
	}

	@Override
	public int boardCount() {
			
		String query = "SELECT COUNT(*) FROM board";
		int count = 0;
		
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			dtos = new ArrayList<>();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return count;
	}

	@Override
	public int checkRecommend(BoardDto dto) {
		String query = "SELECT COUNT(*) FROM board WHERE boardNo=? AND userId=?";
		int count = 0;
		
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getBoardNo());
			ps.setString(2, dto.getWriterId());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return count;
	}

	@Override
	public void insertRecommend(BoardDto dto) {
		
		String query = "INSERT INTO recommend (boardNo, writerId) VALUES ("
				+ " ?,"	//1. boardNo
				+ " ?)";//2. writerId
		
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getBoardNo());
			ps.setString(2, dto.getWriterId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void deleteRecommend(BoardDto dto) {
		String query = "DELETE FROM recommend WHERE boardNo=? AND writerId=?";
		
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getBoardNo());
			ps.setString(2, dto.getWriterId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public int selectCntAll(String search) {
		String query = "SELECT COUNT(*) FROM board WHERE title LIKE '%'||?||'%'";
		int result = 0;
		
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, search);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public ArrayList<BoardDto> selectPagingList(Paging paging) {
		dtos = new ArrayList<>();
		
		String query 
		= "SELECT * FROM ("
		+ " 	SELECT rownum rnum, B.* FROM (" 
		+ " 		SELECT * FROM board "
		+ "			WHERE title LIKE '%'||?||'%'" 
		+ " 		ORDER BY boardNo DESC"
		+ " 	) B"
		+ " 	ORDER BY rnum" 
		+ " ) WHERE rnum between ? AND ?";

		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, paging.getSearch());
			ps.setInt(2, paging.getStartNo());
			ps.setInt(3, paging.getEndNo());
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBoardNo(rs.getInt("boardNo"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setHit(rs.getInt("hit"));
				dto.setRecommend(rs.getInt("recommend"));
				dto.setWrittenDate(rs.getDate("writtenDate"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

}
