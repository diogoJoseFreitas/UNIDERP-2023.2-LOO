package com.uniderp.airlines.system.services;

import java.time.LocalDate;

import com.uniderp.airlines.system.models.BasePessoa;

public class UsuarioSistema extends BasePessoa{
    protected String usuario;
    protected String senha;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public UsuarioSistema(int codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String registro, String usuario, String senha) {
        super(codigo, nome, email, telefone, dataNascimento, registro);
        this.usuario = usuario;
        this.senha = senha;
    }
    
}
