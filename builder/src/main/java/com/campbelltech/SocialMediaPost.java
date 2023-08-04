package com.campbelltech;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

public class SocialMediaPost {
    private String title;
    private String content;
    private String author;
    private LocalDateTime datePosted;
    private List<String> tags;
    private URI imageUri;
    private List<URI> links;

    public List<String> getTags() {
        return tags;
    }

    public List<URI> getLinks() {
        return links;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setImageUri(URI imageUri) {
        this.imageUri = imageUri;
    }

    public void setLinks(List<URI> links) {
        this.links = links;
    }

    public static SocialMediaPostBuilder builder() {
        return new SocialMediaPostBuilder();
    }

    @Override
    public String toString() {
        return "SocialMediaPost{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", datePosted=" + datePosted +
                ", tags=" + tags +
                ", imageUri=" + imageUri +
                ", links=" + links +
                '}';
    }
}
