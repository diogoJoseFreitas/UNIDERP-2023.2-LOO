package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class BasePessoa extends BaseIdentificador{
    protected String nome;
    protected String email;
    protected String rg;
    protected String cpf;
    protected LocalDate dataNascimento;

    protected int codigoProfissao;
    protected int codigoEscolaridade;

    protected ArrayList<Endereco> enderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCodigoProfissao() {
        return codigoProfissao;
    }

    public void setCodigoProfissao(int codigoProfissao) {
        this.codigoProfissao = codigoProfissao;
    }

    public int getCodigoEscolaridade() {
        return codigoEscolaridade;
    }

    public void setCodigoEscolaridade(int codigoEscolaridade) {
        this.codigoEscolaridade = codigoEscolaridade;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public BasePessoa(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento) {
        super(codigo);
        this.nome = nome;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
