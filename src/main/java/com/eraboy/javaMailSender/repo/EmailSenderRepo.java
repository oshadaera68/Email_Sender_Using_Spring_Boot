package com.eraboy.javaMailSender.repo;

import jakarta.mail.MessagingException;

public interface EmailSenderRepo {
    public void sendEmail(String from, String to, String subject, String message);

    public void sendEmailWithAttachment(String from, String to, String subject, String message, String attachment) throws MessagingException;
}
