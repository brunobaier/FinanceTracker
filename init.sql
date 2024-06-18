CREATE TABLE IF NOT EXISTS  user (
       user_id INT PRIMARY KEY AUTO_INCREMENT,
       userName VARCHAR(60) NOT NULL,
       lastName VARCHAR(60) NOT NULL,
       password VARCHAR(100) NOT NULL,
       email VARCHAR(100)

)

CREATE TABLE IF NOT EXISTS  expenses (
    user_id INT,
    dateOfExpenses DATE,
    description VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
)

CREATE TABLE IF NOT EXISTS incomes (
    user_id INT,
    dateOfIncomme DATE,
    description VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
)