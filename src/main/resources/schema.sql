DROP TABLE IF EXISTS Books;
CREATE TABLE Books (
    bookid INT NOT NULL PRIMARY KEY,
    bookname VARCHAR(255),
    author VARCHAR(255),
    price INT
);

CREATE TABLE app_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    roles VARCHAR(255) -- Adjust column types as necessary
);

CREATE TABLE user_roles (
    user_id BIGINT NOT NULL,
    role VARCHAR(255) NOT NULL,
    PRIMARY KEY (user_id, role),
    FOREIGN KEY (user_id) REFERENCES app_user(id) -- Replace 'app_user' with your actual table name
);
