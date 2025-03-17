# NVQ Attestation Desktop Application

A Java-based desktop application for managing NVQ (National Vocational Qualification) attestations and certificates. This application provides a user-friendly interface for student registration, certificate management, and user authentication.

## Features

- User Authentication System
  - Login functionality
  - User registration
  - Secure access control

- Student Management
  - Add new students
  - View student information
  - Manage student records

- Certificate Management
  - Generate NVQ certificates
  - View certificate details
  - Print certificates

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Database
- Required JAR files:
  - mysql-connector-j-8.0.33.jar
  - jcalendar-1.4.jar

## Installation

1. Clone the repository:
```bash
git clone [your-repository-url]
```

2. Set up the MySQL database:
   - Create a new database
   - Configure the database connection in `DBConnection.java`

3. Build the project:
   - Open the project in NetBeans IDE
   - Clean and build the project

## Project Structure

```
src/
├── nvqattestation/
│   ├── DBConnection.java
│   ├── Certificate.java
│   ├── NvtiUI.java
│   ├── Register.java
│   ├── UserLogin.java
│   ├── AddStudent.java
│   ├── Student.java
│   └── User.java
```

## Dependencies

- MySQL Connector/J 8.0.33
- JCalendar 1.4

## Usage

1. Launch the application
2. Login with your credentials
3. Navigate through the different modules:
   - Student Registration
   - Certificate Management
   - User Management

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.


Project Link: [https://github.com/yourusername/nvq-attestation-desktop](https://github.com/yourusername/nvq-attestation-desktop)
