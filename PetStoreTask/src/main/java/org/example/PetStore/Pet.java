package org.example.PetStore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class Pet {
    private int id;
    private String name;
    private List<String> photoUrls;
    private Category category;
    private List<Tag> tags;
    private String status;

    // Getters and Setters

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("photoUrls")
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @JsonSetter("photoUrls")
    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonSetter("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Inner class for Category
    public static class Category {
        private int id;
        private String name;

        // Getters and Setters

        @JsonProperty("id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // Inner class for Tag
    public static class Tag {
        private int id;
        private String name;

        // Getters and Setters

        @JsonProperty("id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
