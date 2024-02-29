package com.email.spring.springemailservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email.spring.springemailservice.dto.Email;

@Service
public class EmailService {
	
	 @Autowired
	 private  JavaMailSender javaMailSender;


	    public void sendEmail(Email mail) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(mail.getTo());
	        message.setSubject(mail.getSubject());
	        message.setText(mail.getText());
	        javaMailSender.send(message);
	    }
	
}
