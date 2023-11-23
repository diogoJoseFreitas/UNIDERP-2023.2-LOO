package cinema.fakedb;

import cinema.dominio.Ingresso;

public class IngressoFakeDB extends BaseGeneriaFakeDB<Ingresso> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ingresso(1, "Meia", "Terror", 1, 1));
        this.tabela.add(new Ingresso(2, "Inteira", "Acao", 2, 2));
        this.tabela.add(new Ingresso(3, "Meia", "Suspense", 3, 3));
    }
    
    public IngressoFakeDB(){
        super();
    }
}
