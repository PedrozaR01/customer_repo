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
    customerId INT NOT NULL PRIMARY KEY,
    email VARCHAR(255),
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    zipCode VARCHAR(255),
    gradeLevel VARCHAR(255),
    topicId VARCHAR(255),
    customerDescription VARCHAR(255) 
);

DROP TABLE IF EXISTS processor;

CREATE TABLE IF NOT EXISTS processor(
    processorId INT NOT NULL PRIMARY KEY,
    email VARCHAR(255),
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    processorIntro VARCHAR(255),
    supportedTopics VARCHAR(255),
    processorGradeLevel VARCHAR(255) 
);

DROP TABLE IF EXISTS topics;

CREATE TABLE IF NOT EXISTS topics(
    topicId INT NOT NULL PRIMARY KEY,
    topicName VARCHAR(255),
    topicGradeLevel VARCHAR(255)
);

DROP TABLE IF EXISTS grade_level;

CREATE TABLE IF NOT EXISTS grade_level(
    gradeLevelId INT NOT NULL PRIMARY KEY,
    gradeLevelName VARCHAR(255)
);