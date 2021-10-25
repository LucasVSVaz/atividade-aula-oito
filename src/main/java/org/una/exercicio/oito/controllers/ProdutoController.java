package org.una.exercicio.oito.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.una.exercicio.oito.models.Categoria;
import org.una.exercicio.oito.models.Produto;
import org.una.exercicio.oito.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {
    private ProdutoService service;

    @GetMapping
    public List<Produto> getAll() {
        return service.getAllProdutos();
    }

    @GetMapping("/{id}")
    public Produto getCategoriaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Produto createCategoria(@RequestBody Produto produto, Categoria categoria) {
        return service.saveProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        service.deleteProduto(id);
    }

    @PostMapping("/{id}")
    public void updateCategoria(@PathVariable Long id, @RequestBody Produto produto) {
        service.updateProduto(id, produto);
    }
}
