package com.mamatha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MailController {
	@Autowired
	MailService b;
	
	@RequestMapping(value = "/sendemail")
	public String sendEmail() {
	try {
		b.sendEmail("mamathatwinkle929@gmail.com","hello mamatha","welcome");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return "Email sent successfully";
	}

}