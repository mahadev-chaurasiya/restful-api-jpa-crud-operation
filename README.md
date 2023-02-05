# restful-api-jpa-crud-operation
#Java11 #MySQL #SpringBoot #RESTful #API #Crudoperation #JPA

Configuration: 
- MySQL
create database employees_db;

- application.properties 
## Database Properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/employees_db?useSSL=false
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

POST - request body
http://localhost:8080/api/v1/addEmployeeDetails
{
	"empFirstName": "Mahadev",
	"empLastName": "Chaurasiya",
	"empDes": "SDE3",
	"empNumber": "2020322",
    "empDOB": "04/08/1995",
    "empEmail": "mahadev.chaurasiya@gmail.com",
	"empDOJ": "01/01/2022"
}

- GET ALL, http://localhost:8080/api/v1/getAllEmployeeDetails
- GET by Id,http://localhost:8080/api/v1/employee/2
- UPDATE by ID, http://localhost:8080/api/v1/employee/2
- DELETE by ID - http://localhost:8080/api/v1/employee/2

