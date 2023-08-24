package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Cliente extends Pessoa{

    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Cliente(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimneto, String rg,
            String cpf, LocalDate dataInsercao, double credito) {
        super(codigo, nome, endereco, telefone, dataNascimneto, rg, cpf, dataInsercao);
        this.credito = credito;
    }
    public Cliente(){
        
    }

    
}
