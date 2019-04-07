## Create spring boot project
    using https://start.spring.io/
    
    
## Reference
    - Learn Spring Boot - Hello World in 2018 With Intelij
     
    - How to Create spring boot application in Intellij IDEA


## Dependencies
- spring-boot-starter-parent
```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.0.4.RELEASE</version>
</parent>
```
This is parent dependency of Spring Boot project. Use it means this project is a Spring Boot project After using parent dependency, other dependencies no need to specify version.

```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
```


## Annotation
@Service

@RequestMapping


## Controller
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