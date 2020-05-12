package com.mamatha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendEmailApplication implements CommandLineRunner{
	@Autowired
	private MailService mailService;
	
	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		int otp = (int) (Math.random() * 1000000);
		try {
		mailService.sendEmail("mamathatwinkle929@gmail.com","Movie Booking!!!","Your otp is "+otp);
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}