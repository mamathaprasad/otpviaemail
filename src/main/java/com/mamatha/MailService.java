package com.mamatha;

public interface MailService {

	public void sendEmail(String toAddress,String subject,String content)throws Exception;
}

