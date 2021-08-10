package com.compassouol;

public class Curso {

    private String nome;
    private int feito;
    private boolean pronto;
    private Tempo tempo;

    public Curso(String nome, int TP, int TV ) {
        this.nome = nome;
        this.tempo = new Tempo(TP, TV);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFeito() {
        return feito;
    }

    public void setFeito(int feito) {
        this.feito = feito;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }
}
