package cinema.dominio;

public class FilmesPorAtor extends BaseIdentificador{
    private int codigoFilme;
    private int codigoAtor;

    
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    public int getCodigoAtor() {
        return codigoAtor;
    }
    public void setCodigoAtor(int codigoAtor) {
        this.codigoAtor = codigoAtor;
    }
    
    public FilmesPorAtor(int codigo, int codigoFilme, int codigoAtor) {
        super(codigo);
        this.codigoFilme = codigoFilme;
        this.codigoAtor = codigoAtor;
    }
    @Override
    public String toString() {
        String s = "Objeto de FilmesPorAtor:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "FilmesPorAtor [codigoFilme=" + codigoFilme + ", codigoAtor=" + codigoAtor + "]\n\n";
        return s;
    }

    
}
