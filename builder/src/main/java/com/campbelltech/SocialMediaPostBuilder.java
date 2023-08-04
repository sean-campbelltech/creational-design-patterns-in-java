package com.campbelltech;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SocialMediaPostBuilder {
    private final SocialMediaPost post = new SocialMediaPost();

    public SocialMediaPostBuilder addTitle(String title) {
        post.setTitle(title);
        return this;
    }

    public SocialMediaPostBuilder addContent(String content) {
        post.setContent(content);
        return this;
    }

    public SocialMediaPostBuilder addAuthor(String author) {
        post.setAuthor(author);
        return this;
    }

    public SocialMediaPostBuilder setPostDate(LocalDateTime postDate) {
        post.setDatePosted(postDate);
        return this;
    }

    public SocialMediaPostBuilder addTag(String tag) {
        if (post.getTags() == null) {
            post.setTags(new ArrayList<>());
        }
        post.getTags().add(tag);
        return this;
    }

    public SocialMediaPostBuilder addImage(URI imageUri) {
        post.setImageUri(imageUri);
        return this;
    }

    public SocialMediaPostBuilder addLink(URI link) {
        if (post.getLinks() == null) {
            post.setLinks(new ArrayList<>());
        }
        post.getLinks().add(link);
        return this;
    }

    public SocialMediaPost build() {
        return post;
    }
}
