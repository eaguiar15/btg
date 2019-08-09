package br.com.xalingo.interfaces;

import javax.servlet.http.HttpServletRequest;

public interface Inter {
	HttpServletRequest insert()  throws Exception; 
	HttpServletRequest update()   throws Exception;
}
