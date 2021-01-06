package com.bianhailena.chatapp2.Model;

public class User {
    private String id;
    private String username;
    private String imageURI;

    public User(String id, String username, String imageURI) {
        this.id = id;
        this.username = username;
        this.imageURI = imageURI;
    }

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURL(String imageURL) {
        this.imageURI = imageURL;
    }
}
