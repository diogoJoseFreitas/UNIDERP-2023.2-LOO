package com.uniderp.loo.atividade3;

import java.time.LocalDate;

public class Professor extends BasePessoa {
    private String registro;
    private LocalDate dataContratação;
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataContratação() {
        return dataContratação;
    }
    public void setDataContratação(LocalDate dataContratação) {
        this.dataContratação = dataContratação;
    }
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratação) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratação = dataContratação;
    }
    public Professor() {
    }
    
}
