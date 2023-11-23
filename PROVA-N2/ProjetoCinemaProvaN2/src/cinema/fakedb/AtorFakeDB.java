package cinema.fakedb;

import cinema.dominio.Ator;

public class AtorFakeDB extends BaseGeneriaFakeDB<Ator>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ator(1, "Pedro", "Policial bom"));
        this.tabela.add(new Ator(2, "Lucas", "Policial mau"));
        this.tabela.add(new Ator(3, "Ana Clara", "Capelzinho"));
        this.tabela.add(new Ator(4, "Joao", "Lobo mau"));
    }

    public AtorFakeDB(){
        super();
    }
}
