package top.tomxwd.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.tomxwd.myweb.pojo.User;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(User user,Model model) {
		model.addAttribute("user",user);
		return "/form/form";
	}
	
}
