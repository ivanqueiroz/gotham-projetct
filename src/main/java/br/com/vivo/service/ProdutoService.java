package br.com.vivo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vivo.model.Produto;
import br.com.vivo.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto criar(Produto produto) {
		return produtoRepository.save(produto);
	}

}
