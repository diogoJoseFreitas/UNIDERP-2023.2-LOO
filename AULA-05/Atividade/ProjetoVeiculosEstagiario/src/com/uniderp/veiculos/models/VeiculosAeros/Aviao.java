package com.uniderp.veiculos.models.VeiculosAeros;

import com.uniderp.veiculos.models.ModeloVeiculo;

public class Aviao extends BaseVeiculoAereo{
    private String nomePiloto;

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public Aviao(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes, String registroAeronaltico,
            String nomePiloto) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes,
                registroAeronaltico);
        this.nomePiloto = nomePiloto;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome do Piloto: " + nomePiloto);
    }
    
}
