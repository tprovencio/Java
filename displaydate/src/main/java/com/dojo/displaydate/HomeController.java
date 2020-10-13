package com.dojo.displaydate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/date")
    public String index(Model model) {
    	Date date=new Date();
    	String text = String.format("%tB, the %<td of %<tB, %<tY", date);
    	model.addAttribute("date",text);
    	return "index.jsp";
    	
}
    @RequestMapping("/time")
    public String time(Model model) {
    	LocalTime now = LocalTime.now();
    	String timeStr = now.format(DateTimeFormatter.ofPattern("hh:mm:ss a",timeStr));
    	System.out.println(timeStr);
    	return "time.jsp";
    }
}
