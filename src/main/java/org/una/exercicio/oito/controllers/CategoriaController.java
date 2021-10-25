package org.una.exercicio.oito.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.una.exercicio.oito.models.Categoria;
import org.una.exercicio.oito.service.CategoriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
@AllArgsConstructor
public class CategoriaController {
    private CategoriaService service;

    @GetMapping
    public List<Categoria> getAll() {
        return service.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Categoria getCategoriaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return service.saveCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        service.deleteCategoria(id);
    }

    @PostMapping("/{id}")
    public void updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        service.updateCategoria(id, categoria);
    }
}
