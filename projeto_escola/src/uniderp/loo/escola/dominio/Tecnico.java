package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario{
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Tecnico(int id, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg, String cpf,
            LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String setor) {
        super(id, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        System.out.println("Código: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Data de Inserção: " + this.dataInsercao);
        System.out.println("Cracha: " + this.cracha);
        System.out.println("Registro: " + this.registro);
        System.out.println("Setor: " + this.setor);

    }
    
    
}