package com.campbelltech;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            SocialMediaPost post = SocialMediaPost.builder()
                    .addTitle("The Builder Design Pattern")
                    .addContent("Some interesting facts about the builder...")
                    .addAuthor("Sean Campbell")
                    .setPostDate(LocalDateTime.now())
                    .addTag("#designPatterns")
                    .addTag("#java")
                    .addLink(new URI("https://somelink.io"))
                    .build();

            System.out.println(post);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}