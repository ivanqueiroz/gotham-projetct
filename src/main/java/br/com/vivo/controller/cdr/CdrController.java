package br.com.vivo.controller.cdr;

import br.com.vivo.dto.CdrDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/cdr")
public class CdrController {

    @PostMapping
    public ResponseEntity<Void> registrar(@RequestBody CdrDto cdrDto) {

        return ResponseEntity.created(URI.create("")).build();
    }

    @DeleteMapping("/{id}")
    public void deletarCdr(@PathVariable Long id) {

    }
}
