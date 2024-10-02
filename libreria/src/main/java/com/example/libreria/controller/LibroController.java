package com.example.libreria.controller;
import com.example.libreria.entity.Libro;
import com.example.libreria.service.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.getAllLibros();
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.createLibro(libro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return ResponseEntity.ok(libroService.updateLibro(id, libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
        return ResponseEntity.noContent().build();
    }
}

