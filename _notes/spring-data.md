


## Maven dependency
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>2.1.3.RELEASE</version>
    </dependency>
```
Using H2 db
``` 
 <dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
 </dependency>
```
Using Postgres
``` 
 <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
 </dependency>
```
        
## configuration
```$xslt
spring.jpa.hibernate.ddl-auto=none
logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
logging.level.org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl=error

spring.jpa.database=postgresql
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/dev
spring.datasource.username=postgres
spring.datasource.password=postgres
```

## Key components
- Repository interface
- Entity object