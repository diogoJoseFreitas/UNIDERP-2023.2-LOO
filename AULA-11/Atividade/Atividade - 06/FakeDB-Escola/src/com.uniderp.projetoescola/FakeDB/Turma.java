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
}
