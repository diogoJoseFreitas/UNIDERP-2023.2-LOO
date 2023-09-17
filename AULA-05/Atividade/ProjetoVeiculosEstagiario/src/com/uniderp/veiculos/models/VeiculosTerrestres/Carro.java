package com.uniderp.veiculos.models.VeiculosTerrestres;

import com.uniderp.veiculos.models.ModeloVeiculo;

public class Carro  extends BaseVeiculoTerrestre{
    private boolean sensorRe;

    public boolean isSensorRe() {
        return sensorRe;
    }

    public void setSensorRe(boolean sensorRe) {
        this.sensorRe = sensorRe;
    }

    public Carro(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes, String chassi, String placa,
            int qtdeEixos, String codigoRenavam, boolean sensorRe) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes,
                chassi, placa, qtdeEixos, codigoRenavam);
        this.sensorRe = sensorRe;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Possui sensor de Re: " + sensorRe);
    }
    
}
