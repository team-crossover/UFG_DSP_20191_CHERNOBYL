package br.com.nelsonwilliam.dsp20191.chernobyl.data.repository;


import br.com.nelsonwilliam.dsp20191.chernobyl.business.entity.AvaliacaoFilme;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AvaliacaoFilmeRepository extends JpaRepository<AvaliacaoFilme, Long> {

    Collection<AvaliacaoFilme> findByFilme (Long idFilme);

    Collection<AvaliacaoFilme> findByUsuario (Long idUsuario);

    void deleteById(Long id);

}
