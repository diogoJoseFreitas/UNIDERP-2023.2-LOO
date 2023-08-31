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
    
    
}