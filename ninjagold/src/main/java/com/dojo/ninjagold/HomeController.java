package com.dojo.ninjagold;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/") 
	public String index(HttpSession session) {
		if (session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			System.out.println("gold reset to 0");
		}
		return "index.jsp";
	}
	@PostMapping("/process_gold")
	public String gold(@RequestParam(value="building") String building,  HttpSession session) {
		Random rand = new Random();
		if (building.equals("farm")) {
			Integer count = (Integer) session.getAttribute("gold");
			session.setAttribute("gold",count + (rand.nextInt((20 - 10) + 1) + 10));
			}
		if (building.equals("cave")) {
			Integer count = (Integer) session.getAttribute("gold");
			session.setAttribute("gold",count + (rand.nextInt((200 - 5) + 1) + 10));
			}
		if (building.equals("house")) {
			Integer count = (Integer) session.getAttribute("gold");
			session.setAttribute("gold",count + (rand.nextInt((50 - 0) + 1) + 10));
			}
		if (building.equals("casino")) {
			Integer count = (Integer) session.getAttribute("gold");
			session.setAttribute("gold",count + (rand.nextInt((500 - -500) + 1) + 10));
			}
		 return "redirect:/";
	}
	
}
