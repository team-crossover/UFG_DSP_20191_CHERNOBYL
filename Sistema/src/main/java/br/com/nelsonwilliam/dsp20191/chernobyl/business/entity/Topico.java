package br.com.nelsonwilliam.dsp20191.chernobyl.business.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "topico")
public class Topico {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Filme filme;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "topico")
    private List<AvaliacaoTopico> avaliacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<AvaliacaoTopico> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoTopico> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}