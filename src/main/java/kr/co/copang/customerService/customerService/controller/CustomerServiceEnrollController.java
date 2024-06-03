package kr.co.copang.customerService.customerService.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.copang.customerService.customerService.model.dto.CustomerServiceDTO;
import kr.co.copang.customerService.customerService.model.service.CustomerServiceImpl;

@WebServlet("/customerService/enroll.do")
public class CustomerServiceEnrollController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerServiceEnrollController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 데이터 받아서 변수에 저장
		String boardTitle = request.getParameter("notice-title");
		String boardContents = request.getParameter("notice-contents");
		
		// DTO 정보 저장
		CustomerServiceDTO csDTO = new CustomerServiceDTO();
		csDTO.setBoardTitle(boardTitle);
		csDTO.setBoardContents(boardContents);
		
		// 서비스 호출
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		int result = customerService.enroll(csDTO);
		
		if(result == 1) {
			response.sendRedirect("/customerService/list.do");
		} else { 
			RequestDispatcher view = request.getRequestDispatcher("/views/customerService/customerService/customerServiceEnroll.jsp");
			view.forward(request, response);
		}
	}

}