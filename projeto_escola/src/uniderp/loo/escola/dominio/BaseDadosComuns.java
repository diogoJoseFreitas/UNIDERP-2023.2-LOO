package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseId{
    protected LocalDate dataInsercao;

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public BaseDadosComuns(int id, LocalDate dataInsercao) {
        super(id);
        this.dataInsercao = dataInsercao;
    }
}
