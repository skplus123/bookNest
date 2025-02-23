# bookNest
This project is a simple RESTful API built using Spring Boot to manage a collection of books.

Purpose: The application provides CRUD (Create, Read, Update, Delete) operations for managing book records in a database.

Endpoints & Functionality:

Test Endpoint (/test): Confirms the service is running by returning a simple string. GET /books: Retrieves a list of all books. GET /books/{bookid}: Fetches details of a specific book identified by its ID. POST /books: Creates a new book entry in the database. PUT /books: Updates an existing book's details. DELETE /books/{bookid}: Deletes a specified book by its ID.

Architecture & Design: Controller-Service Separation: The BooksController handles HTTP requests and delegates the business logic to the BooksService, promoting a clear separation of concerns. Dependency Injection: Uses Spring’s @Autowired annotation to inject dependencies, making the code modular and testable. Logging: Implements basic logging using SLF4J to track service calls, which is useful for debugging and monitoring.

This project demonstrates fundamental skills in building scalable RESTful services, leveraging Spring Boot’s annotations, and implementing a clean, maintainable code structure.
