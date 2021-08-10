package com.compassouol;

public class TestaPrograma {

    public static void main(String[] args){

        //curso cadastrado com tempo informado pela alura e soma do tempo de vídeo
        Curso a = new Curso("Java e java.util: Coleções, Wrappers e Lambda expressions", 720, 246 );
        System.out.println(a.getNome());
        System.out.println(a.getTempo().getTempoPrevisto());
        System.out.println(a.getTempo().getTempoDeVideo());

        System.out.println(valorLegivel(a.getTempo().getTempoPrevisto()));
        System.out.println(valorLegivel(a.getTempo().getTempoDeVideo()));

        a.getTempo().setTempoDecorridoReal(37);
        a.getTempo().adicionaTempoDecorridoVideo(52);
        a.setFeito(23);

        System.out.println(a.getTempo());



    }

    public static String valorLegivel(int valor) {
        int minutos = valor % 60;
        int horas = (valor - minutos)/60;
        return(horas + ":" + minutos + " min ");
    }

}
