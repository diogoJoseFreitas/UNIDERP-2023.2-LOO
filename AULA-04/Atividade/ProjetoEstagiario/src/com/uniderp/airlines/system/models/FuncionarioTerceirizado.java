package com.uniderp.airlines.system.models;

import java.time.LocalDate;

public class FuncionarioTerceirizado extends BasePessoa{
    private String empresa;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public FuncionarioTerceirizado(int codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String registro, String empresa) {
        super(codigo, nome, email, telefone, dataNascimento, registro);
        this.empresa = empresa;
    }
    
}
