package top.tomxwd.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.tomxwd.myweb.pojo.User;

@Controller
public class HelloController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "home";
	}
	
	@RequestMapping(value="/goLogin",method=RequestMethod.GET)
	public String goLogin() {
		System.out.println("goLogin");
		return "login";
	}
	
	@RequestMapping(value="/goRegister",method=RequestMethod.GET)
	public String goRegister() {
		System.out.println("goRegister");
		return "register";
	}
	
	//路径变量
	@RequestMapping(value="/goInfo/{username}",method=RequestMethod.GET)
	public String goInfo(@PathVariable String username,Model model) {
		System.out.println("goInfo");
		model.addAttribute("username",username);
		return "info";
	}
	
	@RequestMapping(value="/goForm",method=RequestMethod.GET)
	public String goForm(Model model) {
		System.out.println("goForm");
		model.addAttribute("user",new User());
		return "/form/form";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password) {
		System.out.println("login");
		System.out.println(username+" "+password);
		if(username.equals("123")&&password.equals("123")) {
			return "redirect:/goInfo/"+username;
		}
		return "redirect:/goLogin";
	}
	
	
}
