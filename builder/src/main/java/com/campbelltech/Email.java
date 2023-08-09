package com.campbelltech;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

// Product
public class Email {
    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private String subject;
    private String body;
    private List<String> attachments;

    // Make sure constructor is private so that only the builder can construct it
    private Email() {
        to = new ArrayList<>();
        cc = new ArrayList<>();
        bcc = new ArrayList<>();
        attachments = new ArrayList<>();
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public List<String> getTo() {
        return to;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    public void send() {
        System.out.println(MessageFormat.format(
                "Email successfully sent from {0} to {1} with subject {2}",
                from, to, subject
        ));
    }

    // Builder
    public static class EmailBuilder {
        private final Email email = new Email();

        public EmailBuilder addFrom(String from) {
            email.setFrom(from);
            return this;
        }

        public EmailBuilder addTo(String to) {
            email.getTo().add(to);
            return this;
        }

        public EmailBuilder addCc(String cc) {
            email.getCc().add(cc);
            return this;
        }

        public EmailBuilder addBcc(String bcc) {
            email.getBcc().add(bcc);
            return this;
        }

        public EmailBuilder withSubject(String subject) {
            email.setSubject(subject);
            return this;
        }

        public EmailBuilder withBody(String body) {
            email.setBody(body);
            return this;
        }

        public EmailBuilder addAttachment(String attachment) {
            email.getAttachments().add(attachment);
            return this;
        }

        public Email build() {
            return email;
        }
    }
}
