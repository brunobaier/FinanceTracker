-- Active: 1718896137700@@127.0.0.1@3306@mydatabase
CREATE TABLE IF NOT EXISTS users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(60) NOT NULL,
    lastName VARCHAR(60) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE
);

CREATE TABLE IF NOT EXISTS expenses (
    nameOfExpense VARCHAR(255) NOT NULL,
    user_id INT,
    dateOfExpenses DATE,
    description VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS income (
    nameOfIncome VARCHAR(100) NOT NULL,
    user_id INT,
    dateOfIncome DATE,
    description VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);