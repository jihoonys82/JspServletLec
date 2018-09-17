package board.dto;

public class MemberDto {
	private String userId;
	private String userPw;
	private String userNick;
	@Override
	public String toString() {
		return "LoginDto [userId=" + userId + ", userPw=" + userPw + ", userNick=" + userNick + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	
	
	
}
