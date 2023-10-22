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
        nome = sc.next();
        sc.nextLine();
        System.out.println("Informe o código do Aluno: ");
        codigo = sc.nextInt();
        this.alunos.add(new Aluno(codigo, nome));
    }

    private int getId(){
        int codigo;
        do {
            this.listarAlunos();
            System.out.println("Indique o ID do Aluno desejado: ");
            codigo = sc.nextInt();
            int id = 0;
            for (Aluno aluno : this.alunos) {
                if (aluno.getCodigo() == codigo) {return id;}
                else{id++;}
            }
            System.out.println("\n\nID Inválido, insira um correto.\n\n");
        } while (true);
    }

    private void alteraNome(){
        int id = this.getId();
        System.out.println("Nome Atual: "+ this.alunos.get(id).getNome());
        System.out.printf("Novo Nome: ");
        this.alunos.get(id).setNome(sc.next());
        sc.nextLine();
        System.out.println("\n\nRenomeado com Sucesso!");
    }
    private void removerAluno(){
        int id = this.getId();
        System.out.println("Removendo "+ this.alunos.get(id).getNome() + "...");
        this.alunos.remove(id);
    }

    private void listarAlunos(){
        System.out.println("Exibindo Lista... \n\n");
        System.out.println("| ID | Aluno |");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private void selecionarAluno(){
        int id = getId();
        this.alunos.get(id).menuAlterarNotas();
    }
    public void menuGerenciarAlunos(){
        int opcao;
        String menu = "\n\n"+
        "1- Adicionar Aluno\n"+
        "2- Alterar Nome do Aluno\n"+
        "3- Excluir aluno\n"+
        "4- Lista Todos\n"+
        "5- Acessar notas de um Aluno\n"+
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
    public void menuRendimentoEscolar(){
        System.out.println("Exibindo menu...");
        int opcao;
        String menu = "\n\n"+
        "1- Mostrar nota de aluno\n"+
        "2- Mostrar media da turma\n"+
        "9- Voltar\n\n";
        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    int id = getId();    
                    this.alunos.get(id).status();
                    
                    break;
                case 2:
                    System.out.println("| A1 | P1 | A2 | P2 | MEDIA | SITUACAO |");
                    for (Aluno aluno : alunos) {
                        aluno.imprime();
                    }
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
