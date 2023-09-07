package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoaJuridica{
    private String servico;
    private LocalDate dataContrato;
    private int periodoEmMeses;
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    public int getPeriodoEmMeses() {
        return periodoEmMeses;
    }
    public void setPeriodoEmMeses(int periodoEmMeses) {
        this.periodoEmMeses = periodoEmMeses;
    }
    public Fornecedor(int id, LocalDate dataInsercao, String endereco, String telefone, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate dataAbertura, String servico, LocalDate dataContrato,
            int periodoEmMeses) {
        super(id, dataInsercao, endereco, telefone, nomeFantasia, razaoSocial, cnpj, ie, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoEmMeses = periodoEmMeses;
    }
    @Override
    public void imprimir() {
        System.out.println("Código: " + this.id);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Inserção: " + this.dataInsercao);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: "+ this.ie);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Periodo em Meses: " + this.periodoEmMeses);
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("Serviço: " + this.servico);
        System.out.println("Telefone: " + this.telefone);

    }
    
}
