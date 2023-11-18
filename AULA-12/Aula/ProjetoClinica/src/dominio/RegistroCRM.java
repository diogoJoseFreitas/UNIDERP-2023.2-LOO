package dominio;

public class RegistroCRM extends BaseIdentificador{
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public RegistroCRM(int codigo, String numero) {
        super(codigo);
        this.numero = numero;
    }
    
}
