package com.uniderp.veiculos.models.VeiculosTerrestres;

import com.uniderp.veiculos.models.ModeloVeiculo;

public class Onibus extends BaseVeiculoTerrestre{
    private boolean sanfonado;

    public boolean isSanfonado() {
        return sanfonado;
    }

    public void setSanfonado(boolean sanfonado) {
        this.sanfonado = sanfonado;
    }

    public Onibus(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes, String chassi, String placa,
            int qtdeEixos, String codigoRenavam, boolean sanfonado) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes,
                chassi, placa, qtdeEixos, codigoRenavam);
        this.sanfonado = sanfonado;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Eh Sanfonado: " + sanfonado);
    }
    
}
