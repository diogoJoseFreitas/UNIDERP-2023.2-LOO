package dominio;

import java.time.LocalDate;

public class Paciente  extends BasePessoa{
    private String nomeMae;

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Paciente(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String nomeMae) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.nomeMae = nomeMae;
    }
}
