package gos.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gos.util.MybatisSqlSessionFactory;
import gos.vo.MemberVO;
import gos.vo.NoticeBoardVO;
import gos.vo.RestautantVO;

public class AdminDaoImpl implements IAdminDao{

	
	//-------사업자 승인 페이지 ------------------ 
	
	// 사업자 정보조회(승인대기)
	@Override
	public List<RestautantVO> waitApproval() {
		
		List<RestautantVO> restList = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			restList = session.selectList("admin.waitApproval");
			
		} finally {
			session.close();
		}
		
		return restList;
	}
	
	// 결재관리버튼(승인)
	@Override
	public int signupApproval(String res_id) {
		
		SqlSession session = null;
		int cnt =0;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.update("admin.signupApproval",res_id);
			
		} finally {
			session.close();		
		}		
		
		return cnt;
	}

	// 결재관리버튼(삭제)
	@Override
	public int signupDelete(String res_id) {
		
		SqlSession session = null;
		int cnt =0;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.delete("admin.signupDelete", res_id);
			
		} finally {
			session.close();
		}		
		
		return cnt;
	}
	
	
	
	//--------- 회원관리----------------------
	// 사업자 정보 조회 (관리자)
	@Override
	public List<RestautantVO> restaurantInfo() {

		List<RestautantVO> restList = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			restList = session.selectList("admin.restaurantInfo");
			
		} finally {
			// TODO: handle finally clause
		}
		
		return restList;
	}

	// 사업자 상세 조회
	@Override
	public RestautantVO restaurantDetail(String rst_id) {
		
		RestautantVO vo = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}
		
		return vo;
	}

	// 멤버 조회
	@Override
	public List<MemberVO> memberInfo() {
		
		List<MemberVO> vo = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}
		
		return vo;
	}


	
	// 멤버 상세조회
	@Override
	public MemberVO memberDetail(String mem_id) {
		
		MemberVO vo = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}
		
		return vo;
	}

	
	
	
	
	
	// 멤버 블랙리스트 관리부분
	
	
	
	
	//---------- 공지사항 게시판
	
	// 공지사항 전체 조회
	@Override
	public List<NoticeBoardVO> noticeBoardInfo() {
		
		List<NoticeBoardVO> vo =null;
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}
		
		return vo;
	}
	

	//선택한 공지사항 조회
	@Override
	public NoticeBoardVO noticeBoardDetail(int nb_id) {
		
		NoticeBoardVO vo =null;
		SqlSession session = null;

		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}
		
		return vo;
	}
	
	//공지사항 입력
	@Override
	public int noticeBoardWrite(NoticeBoardVO vo) {
		
		SqlSession session = null;
		int cnt =0;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}		
		
		return cnt;
	}
	
	// 공지사항 삭제
	@Override
	public NoticeBoardVO signupDelete(int nb_id) {
		
		SqlSession session = null;
		NoticeBoardVO vo = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			
			
		} finally {
			// TODO: handle finally clause
		}		
		
		return vo;
	}
	
	// 공지사항 수정자리
	
}
