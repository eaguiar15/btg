package br.com.xalingo.controller;
import javax.servlet.http.HttpServletRequest;
import br.com.xalingo.dao.Register;
import br.com.xalingo.interfaces.Inter;

public class Controller {
private HttpServletRequest request;
	
	public Controller(HttpServletRequest request) {
			this.request = request;
	}
	
	public String redirect(String opt){
		try {
			if(opt.equals("upd")) {
				new Register(request).update();
			}
			if(opt.equals("ins")) {
				new Register(request).insert();
			}
			 
			Class<?> classe = Class.forName("br.com.xalingo.dao.Register");
			Inter interfaces = (Inter) classe.getDeclaredConstructor(HttpServletRequest.class).newInstance(request);
			
			/*if(opt.equals("upd")) { 
				interfaces.update();
			}
			if(opt.equals("ins")) {
				interfaces.insert();
			}*/
			
			return "back.jsp";
		} catch (ClassNotFoundException e) {
	   		 e.printStackTrace();
	   	 } catch (InstantiationException e) {
	   		 e.printStackTrace();
	   	 } catch (IllegalAccessException e) {
	   		 e.printStackTrace();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
		return "erro";
	}

}
