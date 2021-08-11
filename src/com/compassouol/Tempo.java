package com.compassouol;

public class Tempo {
    private int tempoPrevisto; //tempo previsto pela Alura
    private int tempoDeVideo; // soma do tempo de todos os videos do curso
    private int tempoDecorridoReal; //tempo utilizado para o curso contado por um cronometro externo
    private int tempoDecorridoVideo; //soma do tempo dos videos já assistidos
    private int tempoRestante; //diferença do tempo tempoDecorridoVideo e o tempoDeVideo
    //-----------------------------------------------------//
    public Tempo(int tempoPrevisto, int tempoDeVideo) {
        this.tempoPrevisto = tempoPrevisto;
        this.tempoDeVideo = tempoDeVideo;
        this.tempoRestante = tempoDeVideo;
    }

    @Override
    public String toString() {
        return
                "Tempo total previsto para a conclusão do curso = " + valorLegivel(tempoPrevisto) +
                ",\nTempo total de videos = " + valorLegivel(tempoDeVideo) +
                ",\nTempo utilizado para o curso = " + valorLegivel(tempoDecorridoReal) +
                ",\nTempo de video assistido = " + valorLegivel(tempoDecorridoVideo) +
                ",\nTempo de video restante=" + valorLegivel(tempoRestante);
    }

    //Tempo previsto-----------------------------------------------------//
    public int getTempoPrevisto() {
        return tempoPrevisto;
    }

    public void setTempoPrevisto(int tempoPrevisto) {
        this.tempoPrevisto = tempoPrevisto;
    }
    //Tempo de video -----------------------------------------------------//
    public int getTempoDeVideo() {
        return tempoDeVideo;
    }

    public void setTempoDeVideo(int tempoDeVideo) {
        this.tempoDeVideo = tempoDeVideo;
    }
    //Tempo decorrido real -----------------------------------------------------//
    public int getTempoDecorridoReal() {
        return tempoDecorridoReal;
    }

    public void setTempoDecorridoReal(int tempoDecorridoReal) {
        this.tempoDecorridoReal = tempoDecorridoReal;
    }

    public void adicionaTempoDecorridoReal(int valor){
        this.tempoDecorridoReal += valor;
    }



    //Tempo de video decorrido -----------------------------------------------------//
    public int getTempoDecorridoVideo() {
        return tempoDecorridoVideo;
    }

    public void setTempoDecorridoVideo(int tempoDecorridoVideo) {
        this.tempoDecorridoVideo = tempoDecorridoVideo;

    }

    public void adicionaTempoDecorridoVideo(int valor){
        this.tempoDecorridoVideo += valor;
        this.tempoRestante -= valor;
    }




    //Tempo restante -----------------------------------------------------//
    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = this.getTempoDeVideo() - this.getTempoDecorridoVideo();
    }
    //-----------------------------------------------------//



    public String valorLegivel(int valor) {
        int minutos = valor % 60;
        int horas = (valor - minutos)/60;
        return(horas + ":" + minutos + " min ");
    }
}
