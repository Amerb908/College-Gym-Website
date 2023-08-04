# Gym Titus Web Application

The Gym Titus web application is a Java-based web application developed using HTML, Java, and SQL DBMS. It provides a platform for managing gym membership, personal trainer sessions, and member information.

## Application Flow

The Gym Titus web application follows a typical flow for a gym management system. Here's an overview of the main components and the flow of the code:

### Login and Authentication:

- The application starts with a login page where users can enter their credentials to access the system.
- The login page interacts with the backend Java code to authenticate the user against the stored user credentials in the database.
- If the authentication is successful, the user is redirected to the main dashboard.
- If the authentication is unsuccessful, it will display a message: "Invalid username and password" and will let users try again.

### Dashboard/HomePage:

- The dashboard is the main landing page after successful login.
- It displays gym location and hours with a header and footer. The dashboard retrieves the necessary data from the database through Java code and presents it in a user-friendly format using HTML.

### Services:

- This page displays the machines and weights that are offered by the gym and the trainers' information with their email and hours.
- The services page also has a sign-up form where students can sign up for the gym using their first name, last name, and school email address.
- If any field is missing, it won't let the user proceed and submit the form.
- It will also verify that the email address is entered in the correct format; if not, it will display an error message.
- Once all credentials are entered correctly by the user and submitted, it will display a message: "We will contact you shortly."

### Contact:

- This page displays the location and hours of the gym and a contact form.
- The contact form will also verify that all fields are filled before submitting.

### About:

- The About page will showcase the mission and goals of the users.
- The vision section explains how Gym Titus aims to provide comfort to users' homes.
- The About Us section provides information and welcomes feedback from users.

## Environment Requirements:

To successfully compile and run the Gym Titus web application, ensure that the following environment requirements are met:

- Java/Web Development Kit (JDK) installed
- Eclipse or Visual Studio IDE installed
- Web server (e.g., Apache Tomcat, Apache Tomcat 9.0.74 was used to run the program throughout its development) installed and configured.

## Getting Started:

1. Clone the repository.
2. Create a Dynamic Web Project and replace the SRC premade folder with the SRC folder from the cloned repository.
3. Configure your IDE and web server according to the environment requirements mentioned above.
4. Run the application from your IDE or deploy it to the web server.

## Contribution:

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or create a pull request.
