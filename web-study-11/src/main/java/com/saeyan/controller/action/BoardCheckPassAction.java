package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		String url = null;
		
		BoardVO vo = BoardDAO.getInstance()
				.selectBoardByNum(Integer.parseInt(num));
				
		System.out.println("vo >> " + vo);
		if(vo.getPass().equals(pass)) {
			url= "/board/checkSuccess.jsp";
		}else {
			url = "/board/boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀립니다.");
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
