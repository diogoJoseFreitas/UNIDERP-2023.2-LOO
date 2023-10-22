package com.uniderp.projetoescola.models;

import java.util.Scanner;

public class Aluno {
    private Scanner sc;
    private int codigo;
    private String nome;
    private double notaA1;
    private double notaP1;
    private double notaA2;
    private double notaP2;
    private double media;
    private String situacao;

    private void atualizaMedia(){
        this.media = (((notaA1+notaP1)/2) + ((notaA2+notaP2)/2))/2;
        if (this.media>=6) {
            this.situacao = "Aprovado";
        } else {
            this.situacao = "Reprovado";
        }
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situcao) {
        this.situacao = situcao;
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
        sc = new Scanner(System.in);
    }
    public Aluno(int codigo, String nome) {
        sc = new Scanner(System.in);
        this.codigo = codigo;
        this.nome = nome;
    }
    public void imprime(){
        System.out.println("| "+this.notaA1+" | "+this.notaP1+" | "+this.notaA2+" | "+this.notaP2+" | "+this.media+" | "+this.situacao+" | ");
    }
    public void stauts(){
        System.out.println("Mostrando notas do Aluno: "+ this.nome);
        System.out.println("| A1 | P1 | A2 | P2 | MEDIA | SITUACAO |");
        this.imprime();
    }
    public void menuAlterarNotas(){
        String menu = "\n\n"+
        "1- Alterar nota A1\n"+ 
        "2- Alterar nota P1\n"+
        "3- Alterar nota A2\n"+
        "4- Alterar nota P2\n"+
        "5- Calcular Media\n"+
        "9- Voltar\n\n";
        int opcao;
        do {
            System.out.println("\n\nAluno: "+this.nome);
            System.out.println("Notas:");
            this.stauts();
            System.out.println(menu);
            opcao = this.sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira nota A1: ");
                    setNotaA1(this.sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Insira nota P1: ");
                    setNotaP1(this.sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Insira nota A2: ");
                    setNotaA2(this.sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Insira nota P2: ");
                    setNotaP2(this.sc.nextDouble());
                    break;
                case 5:
                    System.out.println("Calculando média...");
                    this.atualizaMedia();
                    System.out.println("Média Final: "+ this.media);
                    System.out.println("Situação: " + this.situacao);
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("\nVoltando...");
                    break;            
                default:
                    System.out.println("\nOpcao invalida");                    
                    break;
            }
        } while (opcao != 9);
        
    }
    @Override
    public String toString() {
        return "| " + codigo + " | " + nome + " |";
    }
    
    
}
