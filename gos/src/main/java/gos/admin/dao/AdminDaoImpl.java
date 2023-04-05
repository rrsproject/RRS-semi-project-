package gos.admin.dao;

import gos.vo.MemberVO;
import gos.vo.NoticeBoardVO;
import gos.vo.RestautantVO;

public interface AdminDaoImpl {
	
	//-------사업자 승인 페이지 ------------------
	public RestautantVO waitApproval();
	
	public int signupApproval(String res_id);
	
	public int signupDelete(String res_id);
		
	
	
	//--------- 회원관리----------------------
	
	public RestautantVO restaurantInfo();

	public RestautantVO restaurantDetail(String rst_id);
	
	
	public MemberVO memberInfo();
	
	public MemberVO memberDetail(String mem_id);
	
	
	
	//---------- 공지사항 게시판
	public NoticeBoardVO noticeBoardInfo();
	
	
	public NoticeBoardVO noticeBoardDetail(int nb_id);
	
	
	public int noticeBoardWrite(NoticeBoardVO vo);
	
	
	public
	
	
}
