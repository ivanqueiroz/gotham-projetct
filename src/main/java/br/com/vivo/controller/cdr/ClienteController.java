package br.com.vivo.controller.cdr;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivo.dto.ClienteDto;
import br.com.vivo.model.Cliente;
import br.com.vivo.service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping
	public ResponseEntity<Cliente> criar(@RequestBody ClienteDto clienteDto) {
		Cliente cliente = clienteService.criar(modelMapper.map(clienteDto, Cliente.class));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cliente);	
	}

}
