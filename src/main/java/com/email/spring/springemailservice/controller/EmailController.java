package com.email.spring.springemailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.spring.springemailservice.dto.Email;
import com.email.spring.springemailservice.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	private  EmailService emailService;

    
    

    @PostMapping("/send")
    public String sendEmail(@RequestBody Email emailRequest) {
        emailService.sendEmail(emailRequest);
        return "Email sent successfully!";
    }
	
}
