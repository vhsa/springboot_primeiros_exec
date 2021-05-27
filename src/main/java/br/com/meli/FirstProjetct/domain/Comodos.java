package br.com.meli.FirstProjetct.domain;

public class Comodos {

    private String nome;
    private double largura;
    private double comprimento;

    public Comodos(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getMetroQuadrado() {
        return Math.pow((this.getComprimento() + getLargura()), 2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Comodos{" +
                "nome='" + nome + '\'' +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                " tamanho mˆ2=" + getMetroQuadrado() +
                '}';
    }
}
