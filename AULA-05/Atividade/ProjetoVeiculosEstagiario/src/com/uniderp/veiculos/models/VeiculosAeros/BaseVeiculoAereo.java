package com.uniderp.veiculos.models.VeiculosAeros;

import com.uniderp.veiculos.models.BaseVeiculo;
import com.uniderp.veiculos.models.ModeloVeiculo;

public abstract class BaseVeiculoAereo  extends BaseVeiculo{
    protected String registroAeronaltico;

    public String getRegistroAeronaltico() {
        return registroAeronaltico;
    }

    public void setRegistroAeronaltico(String registroAeronaltico) {
        this.registroAeronaltico = registroAeronaltico;
    }

    public BaseVeiculoAereo(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao,
            double pesoTotal, String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes,
            String registroAeronaltico) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes);
        this.registroAeronaltico = registroAeronaltico;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Registro Aeronaltico: " + registroAeronaltico);
    }
    
    
}
