## Login System
# Description
A simple Spring Boot web application that provides login functionality for **Students** and **Admins**. Users can choose their role on the home page and log in using email and password. The system validates credentials from the database and displays success or error messages accordingly.

---

# Screenshots

**Home Page**

![Home page screenshot](https://github.com/mohamud007/login_system/blob/main/Screenshot%202026-03-02%20103211.png)

**Admin Login**

![admin login]()

**Studetn Login**

![astudent login]()

## Features

* Home page with role selection (Student / Admin)
* Student login with email & password
* Admin login with email & password
* Success message on valid credentials
* Error message on invalid credentials
* Database‑driven authentication

---

## Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* MySQL (or any relational DB)

---

## Project Structure

```
src
 └─ main
    ├─ java/com/learning/platform
    │   ├─ controller
    │   │   └─ HomeController.java
    │   ├─ entity
    │   │   └─ User.java
    │   ├─ repository
    │   │   └─ UserRepository.java
    │   └─ PlatformApplication.java
    └─ resources
        ├─ templates
        │   ├─ index.html
        │   ├─ student-login.html
        │   ├─ admin-login.html
        │   ├─ student.html
        │   ├─ admin.html
        │   └─ error.html
        ├─ static/css
        └─ application.properties
```

---

## Database Setup

Create a database (example: `login_system`) and a table `users`:

```sql
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    role VARCHAR(20)
);
```

### Sample Data

```sql
INSERT INTO users (name, email, password, role) VALUES
('mohamud', 'abc@gmail.com', '123', 'student'),
('kranthi', 'def@gmail.com', '456', 'student'),
('vijay', 'ghi@gmail.com', '789', 'admin');
```

---

## Configuration

Update `src/main/resources/application.properties` with your database details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/login_system
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
server.port=8080
```

---

## How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/student-login-system.git
cd student-login-system
```

### 2️⃣ Open in IDE

Open the project in **IntelliJ IDEA / Eclipse / VS Code**.

### 3️⃣ Build the project

If using Maven:

```bash
mvn clean install
```

### 4️⃣ Run the application

Run the main class:

```
PlatformApplication.java
```

or using Maven:

```bash
mvn spring-boot:run
```

### 5️⃣ Open in browser

```
http://localhost:8080
```

---

## Application Flow

1. Open Home Page
2. Select **Student** or **Admin**
3. Enter Email & Password
4. System checks credentials from database
5. Result:

   * ✅ Correct → Login Successful page
   * ❌ Incorrect → Invalid Password message

---

## Future Improvements

* Password encryption (BCrypt)
* Session management
* Registration feature
* Role‑based dashboard
* Spring Security integration

---

## Author

**Mohamud Sk**

---

## License

This project is for learning purposes.
