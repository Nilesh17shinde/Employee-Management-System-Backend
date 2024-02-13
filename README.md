# Employee-Management-System
- Developed a full-stack CRUD web application using Spring Boot for the backend and Angular for the frontend.
- Managed user data persistence through JPA/Hibernate in a MySQL database.
- Implemented RESTful API endpoints for user record operations.
## Dependency
– MySQL:
```xml
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>
```
- lombok
```xml
<dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
</dependency>
```
- web
```xml
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
- data jpa
```xml
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
- Validation:
```xml
  <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
  </dependency>
  ```

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
