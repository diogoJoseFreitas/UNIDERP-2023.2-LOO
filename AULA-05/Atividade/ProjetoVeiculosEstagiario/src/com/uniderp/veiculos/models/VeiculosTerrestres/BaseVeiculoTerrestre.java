package com.uniderp.veiculos.models.VeiculosTerrestres;

import com.uniderp.veiculos.models.BaseVeiculo;
import com.uniderp.veiculos.models.ModeloVeiculo;

public abstract class BaseVeiculoTerrestre extends BaseVeiculo{
    protected String chassi;
    protected String placa;
    protected int qtdeEixos;
    protected String codigoRenavam;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getQtdeEixos() {
        return qtdeEixos;
    }
    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public BaseVeiculoTerrestre(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao,
            double pesoTotal, String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes,
            String chassi, String placa, int qtdeEixos, String codigoRenavam) {
        super(codigo, nome, modelo, cor, anoFabricacao, pesoTotal, nomeProrietario, estadoUf, cidadeUf, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.qtdeEixos = qtdeEixos;
        this.codigoRenavam = codigoRenavam;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Chassi: " + chassi);
        System.out.println("Placa: " + placa);
        System.out.println("Quantidade de Eixos: " + qtdeEixos);
        System.out.println("Codigo Renavam: " + codigoRenavam);
    }
    
}
