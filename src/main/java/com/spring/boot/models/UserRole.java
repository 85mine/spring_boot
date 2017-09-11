package com.spring.boot.models;

public class UserRole {
    private int id;
    private String username;
    private String role;

    public UserRole(String username, String role){
        setUsername(username);
        setRole(role);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
