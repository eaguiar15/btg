package br.com.xalingo.dao;

import javax.servlet.http.HttpServletRequest;

import br.com.xalingo.interfaces.Inter;

public class Register implements Inter {
	private HttpServletRequest request;
	
	public Register(HttpServletRequest request) {
			this.request = request;
	}

	public HttpServletRequest insert() {
		System.out.println("Hi Register.insert()");
		request.setAttribute("message","Hi Register.insert()...");
		
		return request;
	}
	
	public HttpServletRequest update() {
		System.out.println("Hi Register.Update()");
		request.setAttribute("message","Hi Register.update()...");
		
		return request;
	}
}
