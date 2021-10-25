package org.una.exercicio.oito.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.una.exercicio.oito.models.Categoria;
import org.una.exercicio.oito.repository.CategoriaRepositoryJPA;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {
    private CategoriaRepositoryJPA repository;

    @Transactional
    public List<Categoria> getAllCategorias() {
        return repository.findAll();
    }

    @Transactional
    public Categoria findById(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public Categoria saveCategoria(Categoria categoria) {
        return repository.save(categoria);
    }

    @Transactional
    public void deleteCategoria(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public void updateCategoria(Long id, Categoria categoria) {
        categoria.setId(id);
        repository.save(categoria);
    }
}
