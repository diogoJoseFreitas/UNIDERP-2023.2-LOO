package cinema.dominio;

public class Ator extends BaseIdentificador{
    private String nome;
    private String papelDoAtor;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPapelDoAtor() {
        return papelDoAtor;
    }
    public void setPapelDoAtor(String papelDoAtor) {
        this.papelDoAtor = papelDoAtor;
    }
    public Ator(int codigo, String nome, String papelDoAtor) {
        super(codigo);
        this.nome = nome;
        this.papelDoAtor = papelDoAtor;
    }
    @Override
    public String toString() {
        String s = "Objeto de Ator:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "Ator [nome=" + nome + ", papelDoAtor=" + papelDoAtor + "]\n\n";
        return s;
    }
    
}
