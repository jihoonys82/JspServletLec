package dao;

import dto.Member;

public interface MemberDao {
	/**
	 * 회원가입 - Insert
	 * @param insertMember - 회원가입정보
	 * @return boolean - 회원가입 성패 
	 * 		false - 이미 존재하는 userId 이거나 Insert 구문이 실패할 경우<br>
	 * 		true - INSERT 성공 
	 */
	public boolean join(Member insertMember);
	
	
}
