package br.com.meli.FirstProjetct.domain;


import java.util.List;
import java.util.Map;

public class Aluno {

    private String nome;
    private List<Disciplina> notas;

    public Aluno(String nome, List<Disciplina> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getNotas() {
        return notas;
    }

    public void setNotas(List<Disciplina> notas) {
        this.notas = notas;
    }
}
