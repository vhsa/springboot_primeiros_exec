package br.com.meli.FirstProjetct.domain;

import java.util.List;

public class Casa {

    private String nome;
    private String endereco;
    private List<Comodos> comodos;

    public Casa(String nome, String endereco, List<Comodos> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodos> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodos> comodos) {
        this.comodos = comodos;
    }
}
