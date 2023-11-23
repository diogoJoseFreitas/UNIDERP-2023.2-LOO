package cinema.dominio;

public class Ingresso extends BaseIdentificador{
    private String tipo;
    private String categoria;

    private int codigoSessao;
    private int codigoFilme;

    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getCodigoSessao() {
        return codigoSessao;
    }
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    
    public Ingresso(int codigo, String tipo, String categoria, int codigoSessao, int codigoFilme) {
        super(codigo);
        this.tipo = tipo;
        this.categoria = categoria;
        this.codigoSessao = codigoSessao;
        this.codigoFilme = codigoFilme;
    }
    @Override
    public String toString() {
        String s = "Objeto de Ingresso:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "Ingresso [tipo=" + tipo + ", categoria=" + categoria + ", codigoSessao=" + codigoSessao
                + ", codigoFilme=" + codigoFilme + "]\n\n";
        return s;
    }

    
}
