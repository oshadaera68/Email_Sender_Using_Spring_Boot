package com.eraboy.javaMailSender.entity;

public class EmailMessage {
    private String from;
    private String to;
    private String subject;
    private String message;
    private String attachment;


    public EmailMessage() {
    }

    public EmailMessage(String from, String to, String subject, String message, String attachment) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
        this.attachment = attachment;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
