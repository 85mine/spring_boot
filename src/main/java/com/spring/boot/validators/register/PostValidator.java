package com.spring.boot.validators.register;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class PostValidator {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String address;

    //    @NotNull
//    @Pattern(regexp="(^$|[0-9]{10})")
    private int phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
