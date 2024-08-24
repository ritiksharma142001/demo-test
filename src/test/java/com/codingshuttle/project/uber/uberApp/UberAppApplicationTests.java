package com.codingshuttle.project.uber.uberApp;

import com.codingshuttle.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail(
				"xijafe6055@apifan.com",
				"This is the Testing Email",
				"Body of my email");
	}

	@Test
	void sendEmailMultiple() {
		String emails[] = {
				"xijafe6055@apifan.com",
				"contact@codingshuttle.com",
				"shivanilalwani22@gmail.com",
				"premmane3092001@gmail.com",
				"connectankesh@gmail.com"
		};
		emailSenderService.sendEmail(emails, "Hello from the UBER Application demo",
				"This is a good body, Keep coding!");
	}

}
