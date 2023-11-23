package cinema.dominio;

public class Filme extends BaseIdentificador{
    private String titulo;
    private int duracao;
    private String genero;

    private int codigoIngresso;

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }

    public Filme(int codigo, String titulo, int duracao, String genero, int codigoIngresso) {
        super(codigo);
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.codigoIngresso = codigoIngresso;
    }

    @Override
    public String toString() {
        String s = "Objeto de Filme:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "Filme [titulo=" + titulo + ", duracao=" + duracao + ", genero=" + genero + ", codigoIngresso="
                + codigoIngresso + "]\n\n";
        return s;
    }
    
    
}
