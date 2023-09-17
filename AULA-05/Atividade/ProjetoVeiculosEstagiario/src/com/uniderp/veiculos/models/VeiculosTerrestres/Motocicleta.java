package com.uniderp.veiculos.models.VeiculosTerrestres;

import com.uniderp.veiculos.models.ModeloVeiculo;

public class Motocicleta extends BaseVeiculoTerrestre{
    private boolean bagageiro;

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    public Motocicleta(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes, String chassi, String placa,
            int qtdeEixos, String codigoRenavam, boolean bagageiro) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes,
                chassi, placa, qtdeEixos, codigoRenavam);
        this.bagageiro = bagageiro;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Possui Bagageiro: " + bagageiro);
    }
    
}
