package org.finance.entity;

public class User {
    private String userName;
    private String lastName;
    private String userPassword;

    private float salaryRange;

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
}
