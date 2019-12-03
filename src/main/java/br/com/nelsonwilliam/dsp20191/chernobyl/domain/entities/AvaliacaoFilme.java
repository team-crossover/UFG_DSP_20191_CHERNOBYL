package br.com.nelsonwilliam.dsp20191.chernobyl.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "avalfilme")
public class AvaliacaoFilme {

    // Identificação

    @Id
    @GeneratedValue
    private Long id;

    // Atributos

    private int nota = 0;

    // Relacionamentos

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    private Filme filme;

    // Métodos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}