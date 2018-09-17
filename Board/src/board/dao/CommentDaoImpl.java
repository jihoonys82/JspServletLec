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
import board.dto.CommentDto;

public class CommentDaoImpl implements CommentDao {

	private Connection conn = DBConn.getConnection();;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	private CommentDto cdto;
	private ArrayList<CommentDto> cdtos; 
	
	@Override
	public ArrayList<CommentDto> selectCommentByBoardNo(BoardDto bdto) {
		cdtos = new ArrayList<>();
		
		String query = "SELECT * FROM commentTB"
				+ " WHERE boardNo = ?";
		
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, bdto.getBoardNo());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				cdto = new CommentDto();
				cdto.setCommentNo(rs.getInt("commentNo"));
				cdto.setBoardNo(rs.getInt("boardNo"));
				cdto.setUserId(rs.getString("userId"));
				cdto.setCommentWriter(rs.getString("commentWriter"));
				cdto.setPw(rs.getString("pw"));
				cdto.setContent(rs.getString("content"));
				cdto.setWrittenDate(new SimpleDateFormat("yy-MM-dd").parse(rs.getString("writtenDate")));
				cdtos.add(cdto);
				System.out.println(cdto);
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
		return cdtos;


	}

	@Override
	public void insertComment(CommentDto dto) {
		String query = "INSERT INTO commentTB ( commentNo, boardNo, userId, pw, content ) VALUES ("
				+ " commentTB_seq.nextval," // commentNo
				+ " ?," // 1. boardNo
				+ " ?," // 2. userId
				+ " ?," // 3. pw
				+ " ?," // 4. content
				+ " )"; 
	
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getBoardNo());
			ps.setString(2, dto.getUserId());
			ps.setString(3, dto.getPw());
			ps.setString(4, dto.getContent());
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
	public void deleteComment(CommentDto dto) {
		String query = "DELETE FROM commentTB WHERE commentNo = ? "; 
	
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getCommentNo());
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

}
