package com.uniderp.airlines.system.models;

import java.time.LocalDate;

import com.uniderp.airlines.system.services.UsuarioSistema;

public class Funcionario extends UsuarioSistema{
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String registro, String usuario, String senha, String contaCorrente, String cracha) {
        super(codigo, nome, email, telefone, dataNascimento, registro, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
    
}
