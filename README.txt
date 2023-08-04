# Gym Titus Web Application

The Gym Titus web application is a Java-based web application developed using HTML, Java, and an SQL DBMS. It provides a platform for managing gym memberships, personal trainer sessions, and member information.

## Application Flow

The Gym Titus web application follows a typical flow for a gym management system. Here's an overview of the main components and the flow of the code:

### Login and Authentication:

- The application starts with a login page where users can enter their credentials to access the system.
- The login page interacts with the backend Java code to authenticate the user against the stored user credentials in the database.
- If the authentication is successful, the user is redirected to the main dashboard.
- If the authentication is unsuccessful, it will display a message: "Invalid username and password" and prompt users to try again.

### Dashboard/ Home Page:

- The dashboard is the main landing page after a successful login.
- It displays gym location and hours with a header and footer. The dashboard retrieves the necessary data from the database through Java code and presents it in a user-friendly format using HTML.

### Services:

- This page displays the machines and weights offered by the gym and the trainers' information with their email and hours.
- The services page also includes a sign-up form where students can sign up for the gym using their first name, last name, and school email address.
- The form validation ensures that all fields are filled before submitting and that the email address is in the correct format.
- Upon successful submission, it will display a message stating that the gym will contact the user shortly.

### Contact:

- This page displays the gym's location, hours, and contact form.
- The contact form also includes validation to ensure all fields are filled before submission.

### About:

- The About page showcases the mission and goals of the gym.
- The vision section explains how the gym aims to provide comfort to its users' homes.
- The About Us section provides information and welcomes feedback from users.

## Environment Requirements:

To successfully compile and run the Gym Titus web application, ensure that the following environment requirements are met:

- Java/Web Development Kit (JDK) installed
- Eclipse or Visual Studio IDE installed
- Web server (e.g., Apache Tomcat, Apache Tomcat 9.0.74 was used to run the program throughout its development) installed and configured.

## Getting Started:

1. Clone this repository to your local machine.
2. Create a Dynamic Web Project in your IDE.
3. Replace the `SRC` premade folder in the Dynamic Web Project with the `SRC` folder from this repository.
4. Configure your web server (e.g., Apache Tomcat) to run the application.
5. Compile and run the application to access the Gym Titus web application in your browser.
