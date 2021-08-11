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

    @Override
    public String toString() {
        return
                "Nome do curso = " + nome +
                ",\nQuanto foi completo (%) = " + feito+"%" +
                ",\nCurso finalizado = " + pronto +
                ",\n"+ tempo;
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
        if(feito == 100){
            this.pronto = true;
        }
    }

    public boolean isPronto() {
        return pronto;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }
}
