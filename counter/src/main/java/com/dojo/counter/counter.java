package com.dojo.counter;

import javax.servlet.http.HttpSession;

public class counter {
public String index(HttpSession session) {
	session.setAttribute("count", 0);
	Integer count = (Integer) session.getAttribute("count");
	return "index.jsp";
}
}
