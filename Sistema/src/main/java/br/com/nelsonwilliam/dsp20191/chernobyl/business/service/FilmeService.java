package br.com.nelsonwilliam.dsp20191.chernobyl.business.service;

import br.com.nelsonwilliam.dsp20191.chernobyl.business.entity.Filme;
import br.com.nelsonwilliam.dsp20191.chernobyl.data.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll() {
        return filmeRepository.findAll();
    }

    public Collection<Filme> findByDiretor(Long idDiretor) {
        return filmeRepository.findByDiretor(idDiretor);
    }

    public Collection<Filme> findByAtor(Long idAtor) {
        return filmeRepository.findByAtores(idAtor);
    }

    public List<Filme> findByProfissional(Long idProfissional) {
        Collection<Filme> porDiretor = findByDiretor(idProfissional);
        Collection<Filme> porAtor = findByAtor(idProfissional);
        return Stream.of(porDiretor, porAtor).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        filmeRepository.deleteById(id);
    }

    public void save(Filme filme) {
        filmeRepository.save(filme);
    }

}