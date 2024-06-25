package org.finance.model;

import java.util.Date;

public class Income extends User {
    private String nameOfIncome;
    private String description;
    private Double amount;
    private Date dateOfExpenses;

    public String getNameOfIncome() {
        return nameOfIncome;
    }

    public void setNameOfIncome(String nameOfIncome) {
        this.nameOfIncome = nameOfIncome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDateOfExpenses() {
        return dateOfExpenses;
    }

    public void setDateOfExpenses(Date dateOfExpenses) {
        this.dateOfExpenses = dateOfExpenses;
    }
}
