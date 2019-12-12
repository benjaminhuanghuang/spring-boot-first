# Spring Boot 

## Create spring boot project
    https://start.spring.io/
    
    
## Reference
    - Learn Spring Boot - Hello World in 2018 With Intelij
     
    - How to Create spring boot application in Intellij IDEA


## Dependencies 
- spring-boot-starter-parent
```
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
    </parent>
```
This is parent dependency of Spring Boot project. 
After using parent dependency, other dependencies no need to specify version.
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
    </dependency>
```
- spring-boot-starter-thymeleaf: template engine
- spring-boot-starter-web: for web based application
- spring-boot-starter-test: template engine

## Maven Plug-ins
Support mvn commands to create the .jar file
```
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```

## Start spring boot app in command line
```
    mvn clean package
    java -jar target/xxxxxx.jar
```
## Spring boot project 

- SpringbootApplication.java

- SpringbootApplicationTests.java

- src/main/resources/application.properties

## Annotation
@Service

@RequestMapping


## Controller

@RestController

- @RequestMapping("/api")
  Map URI to controller class or method  

@RequestParameter


```
    @RestController
	@RequestMapping("/api")
	public class ApiController{
		@GetMapping("/greeting")
		public String getGreeting(){
			return "Hello World from the API";
		}
	}
```


## Profile
```
    java -jar -Dspring.profiles.active=dev target/...jar
```

