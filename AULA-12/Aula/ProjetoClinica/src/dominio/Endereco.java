package dominio;

public class Endereco extends BaseIdentificador {
    private String logradouro;
    private String complemento;
    private int numero;
    private int cep;
    private int caixaPostal;
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getCaixaPostal() {
        return caixaPostal;
    }
    public void setCaixaPostal(int caixaPostal) {
        this.caixaPostal = caixaPostal;
    }
    public Endereco(int codigo, String logradouro, String complemento, int numero, int cep, int caixaPostal) {
        super(codigo);
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.caixaPostal = caixaPostal;
    }
}
