# Employee-Management-System

## Configure Spring Datasource, JPA, App properties
- For MySQL
```
#By Default mySQL port No is 3306 in my case i have change my port no 3307
# SQL Connection
spring.datasource.url=jdbc:mysql://localhost:3307/employee
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
# Set the Hibernate dialect to the non-deprecated version
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
# DDL Update Auto Table Creation
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
