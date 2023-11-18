package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends BasePessoa{
    private String matricula;
    private ArrayList<RegistroCRM> crms;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public ArrayList<RegistroCRM> getCrms() {
        return crms;
    }
    public void setCrms(ArrayList<RegistroCRM> crms) {
        this.crms = crms;
    }
    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String matricula) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.matricula = matricula;
    }
}
