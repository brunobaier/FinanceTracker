package org.finance.model;

public class User {
    private String userName;
    private String lastName;
    private String userPassword;
    private Double salaryRange;
    private String email;

    public User(String userName, String lastName, String userPassword) {
        this.userName = userName;
        this.lastName = lastName;
        this.userPassword = userPassword;
    }

    public User(String userName, String lastName, String userPassword, Double salaryRange, String email) {
        this.userName = userName;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.salaryRange = salaryRange;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public float getSalaryRange() {
        return salaryRange;
    }


    public void setSalaryRange(float salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
