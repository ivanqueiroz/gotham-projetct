package br.com.vivo.repository;

import br.com.vivo.model.Cdr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdrRepository extends JpaRepository<Cdr, Long> {
}
