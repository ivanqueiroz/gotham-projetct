package br.com.vivo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vivo.model.Cliente;
import br.com.vivo.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente criar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
