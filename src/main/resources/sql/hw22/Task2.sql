create database alevel;
create Table Customer (
  login INT NOT NULL PRIMARY KEY,
  firstName VARCHAR(45),
  lastName VARCHAR(45),
  dateOfBirth DATE,
  country VARCHAR(45),
  sex enum('male','female') DEFAULT 'male');