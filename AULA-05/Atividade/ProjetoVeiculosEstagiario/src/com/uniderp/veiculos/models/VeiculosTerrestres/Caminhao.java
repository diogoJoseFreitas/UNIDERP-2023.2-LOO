package com.uniderp.veiculos.models.VeiculosTerrestres;

import com.uniderp.veiculos.models.ModeloVeiculo;

public class Caminhao extends BaseVeiculoTerrestre{
    private int qtdeEngates;

    public int getQtdeEngates() {
        return qtdeEngates;
    }

    public void setQtdeEngates(int qtdeEngates) {
        this.qtdeEngates = qtdeEngates;
    }

    public Caminhao(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes, String chassi, String placa,
            int qtdeEixos, String codigoRenavam, int qtdeEngates) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes,
                chassi, placa, qtdeEixos, codigoRenavam);
        this.qtdeEngates = qtdeEngates;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de Engates: " + qtdeEngates);
    }
    
}
