package com.eraboy.javaMailSender.repo;

public interface EmailSenderRepo {
    public void sendEmail(String from, String to, String subject, String message);
}
