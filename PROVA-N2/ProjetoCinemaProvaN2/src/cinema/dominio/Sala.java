package cinema.dominio;

public class Sala extends BaseIdentificador{
    private int numAssentos;
    private String tipoTela;
    private String localizcao;

    private int codigoSessao;

    
    public int getNumAssentos() {
        return numAssentos;
    }
    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }
    public String getTipoTela() {
        return tipoTela;
    }
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }
    public String getLocalizcao() {
        return localizcao;
    }
    public void setLocalizcao(String localizcao) {
        this.localizcao = localizcao;
    }
    public int getCodigoSessao() {
        return codigoSessao;
    }
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }

    public Sala(int codigo, int numAssentos, String tipoTela, String localizcao, int codigoSessao) {
        super(codigo);
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizcao = localizcao;
        this.codigoSessao = codigoSessao;
    }
    @Override
    public String toString() {
        String s = "\nObjeto de Sala:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "Sala [numAssentos=" + numAssentos + ", tipoTela=" + tipoTela + ", localizcao=" + localizcao + ", codigoSessao="+codigoSessao+"]\n\n";
        return s;
    }

}
