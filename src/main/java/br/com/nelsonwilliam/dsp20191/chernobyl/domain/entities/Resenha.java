package br.com.nelsonwilliam.dsp20191.chernobyl.domain.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "resenha")
public class Resenha {

    // Identificação

    @Id
    @GeneratedValue
    private Long id;

    // Atributos

    @NotBlank
    @Size(min = 1, max = 500)
    private String texto;

    // Relacionamentos

    @NotNull
    @ManyToOne
    private Usuario autor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Filme filme;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "resenha", orphanRemoval = true)
    private List<AvaliacaoResenha> avaliacoes = new ArrayList<>();

    // Métodos

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

    public List<AvaliacaoResenha> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoResenha> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
}