# customer_repo

In this project I'll create a mysql script that creates a database with 4 tables (customer repo is the name of the database, customer, grade level, topic and processor are the names of the tables).

I'll have to create an API in java that allows me to make basic mysql queries such as inserting, updating, selecting and deleting from tables.

I'm using Spring boot to create the restapi and do the CRUD operation on the tables of the database. Also Spring Data JPA that's responsible for the data access layer of a business application. Hibernate (maven dependency) assists us in the database access code.

The structure is very simple, for each table I create a java class that has a variable for each column of the table, along with getters and setters.

There's also a {tablename}Repository interface that extends the jparepository which takes in an object type of the table (customer, grade level, topic and processor, one for each of these) and the data type of the id (integer). It allows us to get access to various query methods that will be implemented in each table's {tablename}Service.

In the service classes we have 4 methods representing the main http methods (get, post, put and delete), using the repository interface to call these query methods.

Then there's the controllers which have the prefix "/{tablename}" for each table and call the service class to use it's methods to get, post, put and delete.

I used Spring Initializer to have a basic project, I also added the dependencies there which are Spring Web, Spring Data JPA and the MySQL driver.
https://start.spring.io/
