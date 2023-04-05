package gos.admin.controller;

import java.util.List;

import gos.admin.service.AdminServiceImpl;
import gos.admin.service.IAdminService;
import gos.vo.RestautantVO;

public class ex {
	
	public static void main(String[] args) {

		IAdminService service = AdminServiceImpl.getInstance();
		
		// 승인대기 조회
		
		List<RestautantVO> list = service.waitApproval();
		
		for(RestautantVO vo : list) {
			System.out.println(vo);
		}
		
		
		int result = service.signupApproval("c001");
		System.out.println(result);
		
	}


}
