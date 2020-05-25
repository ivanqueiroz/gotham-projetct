package br.com.vivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vivo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
