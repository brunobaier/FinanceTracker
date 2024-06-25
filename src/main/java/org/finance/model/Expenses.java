package org.finance.model;

import java.util.Date;

public class Expenses extends User{
    private String nameOfExpense;
    private String description;
    private Double amount;
    private Date dateOfExpenses;

    public String getNameOfExpense() {
        return nameOfExpense;
    }

    public void setNameOfExpense(String nameOfExpense) {
        this.nameOfExpense = nameOfExpense;
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
