package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import board.dto.BoardDto;
import board.dto.MemberDto;

public class MemberDaoImpl implements MemberDao {

	private Connection conn = DBConn.getConnection();
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	private MemberDto dto;
	
	@Override
	public void createUser(MemberDto dto) {
		String query = "INSERT INTO writer (userId, userNick, userPw) VALUES ("
				+ " ?,"
				+ " ?,"
				+ " ?)";
		
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getUserNick());
			ps.setString(3, dto.getUserPw());
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
	public MemberDto login(String userId, String userPw) {
		dto = new MemberDto();
		String query = "SELECT * FROM writer WHERE "
				+ " userId = ? AND"
				+ " userPw = ?";
		
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, userId);
			ps.setString(2, userPw);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto.setUserId(rs.getString("userId"));
				dto.setUserNick(rs.getString("userNick"));
				dto.setUserPw(rs.getString("userPw"));
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
		return dto;
	}

	@Override
	public int userExist(String userId) {
		String query = "SELECT COUNT(*) FROM writer WHERE userId= ?";
		int existCheck = 0;
		
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				existCheck = rs.getInt(1);
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
		return existCheck;
	}

}
