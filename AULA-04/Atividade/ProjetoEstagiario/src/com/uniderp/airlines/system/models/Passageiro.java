package com.uniderp.airlines.system.models;

import java.time.LocalDate;

import com.uniderp.airlines.system.services.UsuarioSistema;

public class Passageiro extends UsuarioSistema{
    private int numeroCartao;
    private String documento;
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String registro,
            String usuario, String senha, int numeroCartao, String documento) {
        super(codigo, nome, email, telefone, dataNascimento, registro, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    
}
