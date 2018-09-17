package board.dao;

import board.dto.MemberDto;

public interface MemberDao {
	
	public void createUser(MemberDto dto);
	
	public MemberDto login(String userId, String userPw);
	
	public int userExist(String userId);
	
	
}
