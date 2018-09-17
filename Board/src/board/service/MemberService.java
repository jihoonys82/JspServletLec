package board.service;

import board.dao.MemberDao;
import board.dao.MemberDaoImpl;
import board.dto.MemberDto;

public class MemberService {
	
	private MemberDao dao = new MemberDaoImpl();
	
	public void join(MemberDto dto) {
		
		int idExist = dao.userExist(dto.getUserId());
		
		if(idExist==0) {
			dao.createUser(dto);
		}
	}
	
	public MemberDto login(String userId, String userPw) {
		return dao.login(userId, userPw);
	}
}
