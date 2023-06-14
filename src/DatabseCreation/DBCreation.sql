/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  nooby
 * Created: May 26, 2023
 */
CREATE DATABASE IF NOT EXISTS `retailshop`;

USE `retailshop`;

CREATE TABLE IF NOT EXISTS `customer` (
  `CustomerID` int NOT NULL AUTO_INCREMENT,
  `Customer_Name` varchar(300) DEFAULT NULL,
  `Address` varchar(300) DEFAULT NULL,
  `ContactNumber` int NOT NULL,
  PRIMARY KEY (`CustomerID`));


CREATE TABLE IF NOT EXISTS `items` (
  `Item_Code` int NOT NULL AUTO_INCREMENT,
  `Item_Name` varchar(300) NOT NULL,
  `Price` double NOT NULL,
  `MFD` date NOT NULL,
  `EXPDate` date DEFAULT NULL,
  PRIMARY KEY (`Item_Code`));


CREATE TABLE IF NOT EXISTS `orders` (
  `BillID` int NOT NULL AUTO_INCREMENT,
  `CustomerID` int DEFAULT NULL,
  `OrderDate` date DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`BillID`),
  KEY `CustomerID` (`CustomerID`));


CREATE TABLE IF NOT EXISTS `order_details` (
  `OrderID` int NOT NULL AUTO_INCREMENT,
  `Amount` int DEFAULT NULL,
  `Item_Code` int DEFAULT NULL,
  `BillID` int,
  PRIMARY KEY (`OrderID`),
  KEY `Item_Code` (`Item_Code`));
  KEY `BillID` (`BillID`));


CREATE TABLE IF NOT EXISTS `payment` (
  `PaymentID` int NOT NULL AUTO_INCREMENT,
  `PaymentTime` time DEFAULT NULL,
  `Payment_Method` varchar(300) DEFAULT NULL,
  `BillID` int DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `BillID` (`BillID`));

