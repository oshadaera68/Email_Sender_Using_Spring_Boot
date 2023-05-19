package com.eraboy.javaMailSender.controller;

import com.eraboy.javaMailSender.entity.EmailMessage;
import com.eraboy.javaMailSender.repo.EmailSenderRepo;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailSenderController {
    private final EmailSenderRepo emailSenderRepo;

    public EmailSenderController(EmailSenderRepo emailSenderRepo) {
        this.emailSenderRepo = emailSenderRepo;
    }

    @PostMapping("/send-email")
    public ResponseEntity emailSending(@RequestBody EmailMessage emailMessage) {
        this.emailSenderRepo.sendEmail(emailMessage.getFrom(), emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
        return ResponseEntity.ok("You have sent an email successfully to:" + emailMessage.getTo());
    }

    @PostMapping("/send-attachment")
    public ResponseEntity emailSendingWithAttachment(@RequestBody EmailMessage emailMessage) throws MessagingException {
        this.emailSenderRepo.sendEmailWithAttachment(emailMessage.getFrom(), emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage(), emailMessage.getAttachment());
        return ResponseEntity.ok("You have sent an email with an attachment Successfully to" + emailMessage.getTo());
    }
}
