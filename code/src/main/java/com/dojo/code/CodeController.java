package com.dojo.code;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/createError")
	public String flashmessages (RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error","You must train harder");
		return "redirect:/";
	}
	@PostMapping("/code")
	public String code(@RequestParam(value="code") String code) {
		if (code.equals("bushido"))
		return "code.jsp";
		else  return "redirect:/createError";
	}
}
