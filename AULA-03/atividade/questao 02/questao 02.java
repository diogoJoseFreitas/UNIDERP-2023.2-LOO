public abstract class BaseIdentificador {
    protected int id;
        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public BaseIdentificador(int id) {
        this.id = id;
    }
}
public class Classe extends BaseIdentificador {
    protected String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Classe(int id, String nome) {
        super(id);
        this.nome = nome;
    }
}
public class Subclasse extends Classe {
    protected String qualificador;
    public String getQualificador() {
        return qualificador;
    }
    public void setQualificador(String qualificador) {
        this.qualificador = qualificador;
    }
    public Subclasse(int id, String nome, String qualificador) {
        super(id, nome);
        this.qualificador = qualificador;
    } 
}
public class Produto extends Subclasse {
    protected String marcador;
    public String getMarcador() {
        return marcador;
    }
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    public Produto(int id, String nome, String qualificador, String marcador) {
        super(id, nome, qualificador);
        this.marcador = marcador;
    }
}
