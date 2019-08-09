package br.com.xalingo.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.xalingo.controller.Controller;
import br.com.xalingo.dao.Register;

@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String opt = request.getParameter("opt");
		
		/*if(opt.equals("upd")) {
			new Register(request).update();
		}
		if(opt.equals("ins")) {
			new Register(request).insert();
		}*/
		System.out.println("refresh");
		String red = new Controller(request).redirect(opt);
		
		request.getRequestDispatcher(red).forward(request,	response);
	}

}
