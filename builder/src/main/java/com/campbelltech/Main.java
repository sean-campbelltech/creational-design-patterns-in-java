package com.campbelltech;

public class Main {
    public static void main(String[] args) {
        Email email = Email.builder()
                .addFrom("info@campbelltech.io")
                .addTo("john@gmail.com")
                .addTo("jane@yahoo.com")
                .addCc("jones@campbelltech.io")
                .withSubject("The Builder Pattern Tutorial")
                .withBody("Checkout this awesome blog on how to code the Builder Pattern")
                .addAttachment("Builder-Pattern.pdf")
                .build();

        email.send();
    }
}