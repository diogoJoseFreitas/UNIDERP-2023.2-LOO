package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{
    private String matricula;
    private LocalDate dataMatricula;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public Aluno(int id, LocalDate dataInsercao, String endereco, String telefone, String matricula,
            LocalDate dataMatricula) {
        super(id, dataInsercao, endereco, telefone);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    
}
