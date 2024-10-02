CREATE DATABASE libreria;

USE libreria;

CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    fecha_publicacion DATE,
    isbn VARCHAR(20),
    disponible BOOLEAN DEFAULT TRUE
);
