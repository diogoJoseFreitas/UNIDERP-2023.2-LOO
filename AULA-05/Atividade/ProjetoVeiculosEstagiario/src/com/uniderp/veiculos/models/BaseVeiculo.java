package com.uniderp.veiculos.models;

import com.uniderp.veiculos.services.IImpressao;

public abstract class BaseVeiculo implements IImpressao{
    protected int codigo;
    protected String nome;
    protected ModeloVeiculo modelo;
    protected String cor;
    protected int anoFabricacao;
    protected double pesoTotal;
    protected String nomeProrietario;
    protected String estadoUf;
    protected String cidadeUf;
    protected int qtdeOcupantes;


    @Override
    public void imprimir() {
        
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        modelo.imprimir();
        System.out.println("cor: " + cor);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
        System.out.println("Peso Total: " + pesoTotal);
        System.out.println("Nome do Proprietário: " + nomeProrietario);
        System.out.println("Estado: " + estadoUf);
        System.out.println("Cidade: " + cidadeUf);
        System.out.println("Quantidade de Ocupantes: " + qtdeOcupantes);

    }

    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ModeloVeiculo getModelo() {
        return modelo;
    }
    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public String getNomeProrietario() {
        return nomeProrietario;
    }
    public void setNomeProrietario(String nomeProrietario) {
        this.nomeProrietario = nomeProrietario;
    }
    public String getEstadoUf() {
        return estadoUf;
    }
    public void setEstadoUf(String estadoUf) {
        this.estadoUf = estadoUf;
    }
    public String getCidadeUf() {
        return cidadeUf;
    }
    public void setCidadeUf(String cidadeUf) {
        this.cidadeUf = cidadeUf;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }


    public BaseVeiculo(int codigo, String nome, ModeloVeiculo modelo, String cor, int anoFabricacao, double pesoTotal,
            String nomeProrietario, String estadoUf, String cidadeUf, int qtdeOcupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.pesoTotal = pesoTotal;
        this.nomeProrietario = nomeProrietario;
        this.estadoUf = estadoUf;
        this.cidadeUf = cidadeUf;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    

    
}
