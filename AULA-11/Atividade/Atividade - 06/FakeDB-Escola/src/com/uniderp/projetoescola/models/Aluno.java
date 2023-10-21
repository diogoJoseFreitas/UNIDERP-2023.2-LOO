package com.uniderp.projetoescola.models;

public class Aluno {

    private int codigo;
    private String nome;
    private double notaA1;
    private double notaP1;
    private double notaA2;
    private double notaP2;
    private double media;
    private void atualizaMedia(){
        this.media = (((notaA1+notaP1)/2) + ((notaA2+notaP2)/2))/2;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
        this.atualizaMedia();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        this.atualizaMedia();
    }
    public double getNotaA1() {
        return notaA1;
    }
    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
        this.atualizaMedia();
    }
    public double getNotaP1() {
        return notaP1;
    }
    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
        this.atualizaMedia();
    }
    public double getNotaA2() {
        return notaA2;
    }
    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
        this.atualizaMedia();
    }
    public double getNotaP2() {
        return notaP2;
    }
    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
        this.atualizaMedia();
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
        this.atualizaMedia();
    }
    public Aluno() {
    }
    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "|codigo = " + codigo + " | nome = " + nome + " |";
    }
    
    
}
