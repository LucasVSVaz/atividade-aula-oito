package org.una.exercicio.oito.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.una.exercicio.oito.models.Produto;
import org.una.exercicio.oito.repository.ProdutoRepositoryJPA;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {
    private ProdutoRepositoryJPA repository;

    @Transactional()
    public List<Produto> getAllProdutos() {
        return repository.findAll();
    }

    @Transactional
    public Produto findById(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public Produto saveProduto(Produto produto) {
        return repository.save(produto);
    }

    @Transactional
    public void deleteProduto(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public void updateProduto(Long id, Produto produto) {
        produto.setId(id);
        repository.save(produto);
    }
}
