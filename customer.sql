/*Script to create a database named customer repo and 4 tables
table customer
    customer id
    email address
    first name
    last name
    zip code
    grade level
    topic id
    customer dexcription
table processor
    processor id
    email add
    fistName
    lastName
    processor introduction
    supported topics
    processor grade level
table topics
    topic id
    topic name
    topic grade level
table grade level
    grade level id
    grade level name
*/

/*You'll have to be logged in at your server instance and execute this script*/

/*Droping the database 'customer_repo' if it exists and creating it*/
DROP DATABASE IF EXISTS customer_repo;
CREATE DATABASE IF NOT EXISTS customer_repo;

/*selecting the database to work with*/
USE customer_repo;

/* Droping the tables if they exists, creating them with the specified required fields*/
DROP TABLE IF EXISTS customer;

CREATE TABLE IF NOT EXISTS customer (
    customer_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    zip_code VARCHAR(255),
    grade_level VARCHAR(255),
    topic_id VARCHAR(255),
    customer_description VARCHAR(255) 
);

DROP TABLE IF EXISTS processor;

CREATE TABLE IF NOT EXISTS processor(
    processor_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    processor_intro VARCHAR(255),
    supported_topics VARCHAR(255),
    processor_grade_level VARCHAR(255) 
);

DROP TABLE IF EXISTS topic;

CREATE TABLE IF NOT EXISTS topic(
    topic_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    topic_name VARCHAR(255),
    topic_grade_level VARCHAR(255)
);

DROP TABLE IF EXISTS grade_level;

CREATE TABLE IF NOT EXISTS grade_level(
    grade_level_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    grade_level_name VARCHAR(255)
);