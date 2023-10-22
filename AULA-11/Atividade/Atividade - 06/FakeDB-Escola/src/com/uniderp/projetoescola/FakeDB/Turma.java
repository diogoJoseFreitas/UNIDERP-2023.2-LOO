package com.uniderp.projetoescola.FakeDB;

import java.util.ArrayList;
import java.util.Scanner;

import com.uniderp.projetoescola.models.Aluno;

public class Turma {
    private Scanner sc;
    private ArrayList<Aluno> alunos;
    public Turma(){
        alunos = new ArrayList<Aluno>();
        sc = new Scanner(System.in);
    }

    private void insereAluno(){
        int codigo;
        String nome;
        System.out.println("Informe o Nome do Aluno: ");
        nome = sc.nextLine();
        System.out.println("Informe o código do Aluno: ");
        codigo = sc.nextInt();
        this.alunos.add(new Aluno(codigo, nome));
    }

    private void alteraNome(){

    }
    private void removerAluno(){

    }

    private void listarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private void selecionarAluno(){

    }
    private void menuGerenciarAlunos(){
        int opcao;
        String menu = "\n\n"+
        "1- Adicionar Aluno\n"+
        "2- Alterar Nome do Aluno\n"+
        "3- Excluir aluno\n"+
        "4- Lista Todos\n"+
        "5- Selecionar um Aluno da Lista, para\n"+
        "9- Voltar\n\n";
        do {
        
            System.out.println(menu);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    this.insereAluno();
                    break;
                case 2:
                    this.alteraNome();
                    break;
                case 3:
                    this.removerAluno();
                    break;
                case 4:
                    this.listarAlunos();
                    break;
                case 5:
                    this.selecionarAluno();
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
}
