package com.example.MailSender.MailSend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MailSendApplication implements ApplicationRunner {
    private static Logger log = LoggerFactory.getLogger(MailSendApplication.class);

    /**
     *
     *
     *this tutorial for mail send with spring boot application
     */
    @Autowired
    private EmailService emailService;



    public static void main(String[] args) {
        SpringApplication.run(MailSendApplication.class, args);

    }
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Mail - Sending Simple Email with JavaMailSender Example");

        Mail mail = new Mail();
        mail.setFrom("your_mail@yandex.com");
        mail.setTo("send_mail");
        mail.setSubject("Sending Simple Email with JavaMailSender Example");
        mail.setContent("");

        emailService.sendSimpleMessage(mail);
    }
}
