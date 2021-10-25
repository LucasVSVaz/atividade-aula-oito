package org.una.exercicio.oito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.exercicio.oito.models.Produto;

@Repository
public interface ProdutoRepositoryJPA extends JpaRepository<Produto, Long> {
}
