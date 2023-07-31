package com.bezkoder.spring.hibernate.onetomany.model;

public class CommentResponse {
    private Long id;
    private String content;
    private Tutorial tutorial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Tutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }

    // Constructors, getters, and setters

    // Nested class for Tutorial
    public static class Tutorial {
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isPublished() {
            return published;
        }

        public void setPublished(boolean published) {
            this.published = published;
        }

        private String title;
        private String description;
        private boolean published;

        // Constructors, getters, and setters
    }

    // Constructors, getters, and setters for the CommentResponse class
}
