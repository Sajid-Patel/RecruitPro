The Campus Requirement API is a Spring Boot-based REST API designed to streamline campus job postings and student applications. It automates the job application process, ensures data accuracy, and facilitates communication between students and employers. The key entities are Students, Users, Job Postings, Job Applications, and Interviews.

The workflow begins with student registration, followed by viewing available job postings and applying for jobs. Upon application, the job status is set to APPLIED. Employers can review and approve applications, changing the status to APPROVED. After approval, students can schedule an Interview linked to their application.

The project uses a layered architecture:

> Controller Layer: Handles incoming HTTP requests, validates data, and returns responses.
> Service Layer: Implements business logic, coordinates interactions between controller and DAO, and ensures data integrity.
> DAO Layer: Handles CRUD operations with the database and abstracts database-specific details.

Technologies used in the project include Spring Boot 2, MySQL, Hibernate 5, JDK 1.8, and Maven. Postman is utilized for API testing.

The API is divided into five main modules:

1] User Module: Manages user authentication (login, create, update, delete).
2] Student Module: Handles student registration and updates.
3] Job Posting Module: Manages job postings (create, retrieve, update, delete).
4] Job Application Module: Allows students to apply for jobs and update application statuses.
5] Interview Module: Manages interview scheduling and status updates.

Each module includes specific API endpoints to support actions such as job application submissions, status updates, and interview management. The project aims to automate and improve the hiring process by integrating student and employer workflows efficiently.
