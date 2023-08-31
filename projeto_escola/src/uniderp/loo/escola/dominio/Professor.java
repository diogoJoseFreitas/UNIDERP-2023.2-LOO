package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BaseFuncionario{
    private String cadeira;

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public Professor(int id, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cadeira) {
        super(id, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        this.cadeira = cadeira;
    }
    
    
}
