package com.example.libreria.service;

import com.example.libreria.entity.Libro;
import com.example.libreria.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Libro createLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro updateLibro(Long id, Libro libro) {
        libro.setId(id);
        return libroRepository.save(libro);
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
