package kr.co.copang.request.model.service;

import kr.co.copang.request.model.dao.RequestDAO;
import kr.co.copang.request.model.dto.RequestDTO;

public class RequestServiceImpl implements RequestService{
	
	RequestDAO rDAO = new RequestDAO();
	
	@Override
	public int enroll(RequestDTO rDTO) {
		return rDAO.enroll(rDTO);
	}
	
	@Override
	public RequestDTO getRequest(int requestNo) {
		return rDAO.getRequest(requestNo);
	}
	
	@Override
	public RequestDTO getRequestNo(int userNo) {
		return rDAO.getRequestNo(userNo);
	}
	
	@Override
	public int editEnroll(RequestDTO rDTO) {
		return rDAO.editEnroll(rDTO);
	}
}
