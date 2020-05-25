package br.com.vivo.service;

import br.com.vivo.dto.CdrDto;
import br.com.vivo.model.Cdr;
import br.com.vivo.repository.CdrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CdrService {

    @Autowired
    private CdrRepository cdrRepository;

    public Cdr criarCdr(CdrDto cdrDto) {
        final Cdr cdr = new Cdr(cdrDto);
        return cdrRepository.save(cdr);
    }

    public void deletarCdr(Long id) {
        cdrRepository.deleteById(id);
    }


}
