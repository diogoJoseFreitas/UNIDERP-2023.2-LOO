package uniderp.loo.escola.fakedb;

import java.util.ArrayList;
import java.util.List;

import uniderp.loo.escola.dominio.Aluno;

public class AlunoFakeDB {
    private List<Aluno> tabela;

    public List<Aluno> getTabela() {
        return tabela;
    }

    public AlunoFakeDB() {
        this.tabela = new ArrayList<Aluno>();
    } 

}
