package com.uniderp.veiculos.models;

import com.uniderp.veiculos.services.iImpressao;

public class ModeloVeiculo implements iImpressao{
    private String marca;
    private String modelo;
    private int anoModelo;
    private double pesoLiquido;
    private String tipoVeiculo;
    private int qtdeAssentos;
    private int qtdePortas;
    private int qtdeRodas;
    private double potencia;
    private String fabricante;
    private String tipoCombustivel;
    private int qtdeMotores;

    @Override
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano do Modelo: " + anoModelo);
        System.out.println("Peso Líquido (Kg): " + pesoLiquido);
        System.out.println("Tipo de Veículo: " + tipoVeiculo);
        System.out.println("Quantidade de Assentos: " + qtdeAssentos);
        System.out.println("Quantidade de Portas: " + qtdePortas);
        System.out.println("Quantidade de Rodas: " + qtdeRodas);
        System.out.println("Potência: " + potencia);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade de Motores: " + qtdeMotores);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(int qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    
    public ModeloVeiculo(String marca, String modelo, int anoModelo, double pesoLiquido, String tipoVeiculo,
            int qtdeAssentos, int qtdePortas, int qtdeRodas, double potencia, String fabricante, String tipoCombustivel,
            int qtdeMotores) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.pesoLiquido = pesoLiquido;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeAssentos = qtdeAssentos;
        this.qtdePortas = qtdePortas;
        this.qtdeRodas = qtdeRodas;
        this.potencia = potencia;
        this.fabricante = fabricante;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdeMotores = qtdeMotores;
    }
    
}
