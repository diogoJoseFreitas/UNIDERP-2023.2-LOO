package cinema.dominio;

import java.util.ArrayList;

public class Sessao extends BaseIdentificador{
    private String statusDaSecao;
    private String data;
    private String horario;

    
    private int codigoIngresso;
    private ArrayList<Sala> salas;

    public String getStatusDaSecao() {
        return statusDaSecao;
    }
    public void setStatusDaSecao(String statusDaSecao) {
        this.statusDaSecao = statusDaSecao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getCodigoIngresso() {
        return codigoIngresso;
    }
    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }
    public ArrayList<Sala> getsalas() {
        return salas;
    }
    public void setsalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }


    public Sessao(int codigo, String statusDaSecao, String data, String horario, int codigoIngresso,
            ArrayList<Sala> salas) {
        super(codigo);
        this.statusDaSecao = statusDaSecao;
        this.data = data;
        this.horario = horario;
        this.codigoIngresso = codigoIngresso;
        this.salas = salas;
    }


    @Override
    public String toString() {
        String s = "Objeto de Sessao:\n";
        s += "BaseIdentificador [codigo=" + codigo + "]\n";
        s += "Sessao [statusDaSecao=" + statusDaSecao + ", data=" + data + ", horario=" + horario
                + ", codigoIngresso=" + codigoIngresso + ", salas=" + salas + "]\n";
        return s;
    }

    
}
