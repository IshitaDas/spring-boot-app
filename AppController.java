package com.fiserv.controller;

import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiserv.form.User;
import com.fiserv.service.LoginService;
import com.fiserv.view.EmployeeHome;

@Controller
public class AppController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = { "/", "/index" })
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping("/submitlogin")
	public String submitLogin(Map<String, Object> map, HttpServletRequest request, HttpSession session,
			@ModelAttribute("user") User user) {
		
		String empId, empPwd, empResult;
		
		empId = user.getUserName();
		empPwd = user.getPassword();
		
		//String userName = (String) request.getParameter("userName");
		//String pwd = (String) request.getParameter("password");

		System.out.println("userName and Password = " + user.getUserName() + user.getPassword());   

		
		/*String loginValidation = loginService.authUser(user.getUserName(), user.getPassword());
		
		if (loginValidation.startsWith("Success", 0)) {            
			String empNameDate = loginValidation.substring(8); 		 	
			
			map.put("empNameDate", empNameDate);   					 
			return "home";											 
		} else {
			String loginError = loginValidation.substring(6);
			map.put("loginError", loginError);
			return "index";
		}*/
		
		boolean loginValidation = loginService.authUser(empId, empPwd);
		
		if (loginValidation){
			EmployeeHome empHomeDetail = loginService.getHomePageDetail(empId);
		    map.put("empHomeDetail", empHomeDetail);
			return "home";
		}
		else{
			map.put("loginError", "Incorrect Id or password");
			return "index";
		}	
	}

	@RequestMapping("/registration")
	public ModelAndView registration() {
		ModelAndView model = new ModelAndView("registration");
		/*
		 * ModelAndView model = new ModelAndView("home2");
		 * model.addObject("message", "hii");
		 */
		return model;
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("about");
		return model;
	}

	@RequestMapping("/passwordreset")
	public ModelAndView pwdreset() {
		ModelAndView model = new ModelAndView("passwordreset");
		return model;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView model = new ModelAndView("logout");
		return model;
	}
}
