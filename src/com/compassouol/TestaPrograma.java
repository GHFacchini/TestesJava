package com.compassouol;

public class TestaPrograma {

    public static void main(String[] args){

        //curso cadastrado com tempo informado pela alura e soma do tempo de vídeo
        Curso a = new Curso("Java e java.util: Coleções, Wrappers e Lambda expressions", 720, 246 );
        a.getTempo().setTempoDecorridoReal(37);
        a.getTempo().adicionaTempoDecorridoVideo(52);
        a.setFeito(23);

        System.out.println(a);



    }

    public static String valorLegivel(int valor) {
        int minutos = valor % 60;
        int horas = (valor - minutos)/60;
        return(horas + ":" + minutos + " min ");
    }

}
