package cinema.fakedb;

import java.util.ArrayList;

public abstract class BaseGeneriaFakeDB<TDomino> {
    protected ArrayList<TDomino> tabela;

    public ArrayList<TDomino> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<>();
        }
        return tabela;
    }

    protected abstract void CarregarDados();

    public BaseGeneriaFakeDB() {
        this.getTabela();
        this.CarregarDados();
    }

    public void Listar(){
        for (TDomino objeto : tabela) {
            System.out.println(objeto);
        }
    }
    
}
