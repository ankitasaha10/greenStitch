# greenStitch 
GreenStitch - Spring Boot Application
Description
GreenStitch is a Spring Boot application designed to test spring security and jwt authentication and authorisation. 

# Installation
Follow these steps to set up and run the GreenStitch application:

1: Clone the repository
git clone https://github.com/ankitasaha10/greenStitch.git
cd greenStitch

2.Database Configuration
GreenStitch requires a database to store and retrieve data. By default, the application uses 
an H2 in-memory database for ease of testing. However, you can configure other databases like 
MySQL, PostgreSQL, or Oracle by modifying the application.properties file.

3. Run the application
   The application will start, and you can access it at http://localhost:8080 in your web browser.

# Additional Dependencies and Libraries
GreenStitch uses the following additional dependencies and libraries:

Spring Boot [3.0.1]
[Other major dependencies or libraries used] 
# for h2 db, spring security, jwt token, jpa, lombok.
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>

