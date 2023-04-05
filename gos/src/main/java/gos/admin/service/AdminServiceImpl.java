package gos.admin.service;

import java.util.List;

import gos.admin.dao.AdminDaoImpl;
import gos.admin.dao.IAdminDao;
import gos.vo.MemberVO;
import gos.vo.NoticeBoardVO;
import gos.vo.RestautantVO;

public class AdminServiceImpl implements IAdminService {

	private static AdminServiceImpl service;
	private IAdminDao dao;
	
	private AdminServiceImpl() {
		dao = AdminDaoImpl.getInstance();
	}
	
	public static AdminServiceImpl getInstance() {
		if(service==null) service = new AdminServiceImpl();
		return service;
	}
	
	
	//-------사업자 승인 페이지 ------------------

	@Override
	public List<RestautantVO> waitApproval() {
		return dao.waitApproval();
	}

	@Override
	public int signupApproval(String res_id) {
		return dao.signupApproval(res_id);
	}

	@Override
	public int signupDelete(String res_id) {
		return dao.signupDelete(res_id);
	}

	
	
	
	//--------- 회원관리----------------------
	@Override
	public List<RestautantVO> restaurantInfo() {
		return dao.restaurantInfo() ;
	}

	@Override
	public RestautantVO restaurantDetail(String rst_id) {
		return dao.restaurantDetail(rst_id);
	}

	@Override
	public List<MemberVO> memberInfo() {
		return dao.memberInfo();
	}

	@Override
	public MemberVO memberDetail(String mem_id) {
		return dao.memberDetail(mem_id);
	}

	
	
	// 멤버 블랙리스트 관리부분
	
	
	
	
	//---------- 공지사항 게시판
	@Override
	public List<NoticeBoardVO> noticeBoardInfo() {
		return dao.noticeBoardInfo();
	}

	@Override
	public NoticeBoardVO noticeBoardDetail(int nb_id) {
		return dao.noticeBoardDetail(nb_id);
	}

	public int noticeBoardWrite(NoticeBoardVO vo) {
		return dao.noticeBoardWrite(vo);
	}

	@Override
	public int signupDelete(int nb_id) {
		return dao.signupDelete(nb_id);
	}

}
