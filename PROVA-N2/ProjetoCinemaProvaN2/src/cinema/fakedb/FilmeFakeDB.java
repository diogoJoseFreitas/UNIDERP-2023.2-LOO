package cinema.fakedb;

import cinema.dominio.Filme;

public class FilmeFakeDB extends BaseGeneriaFakeDB<Filme>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Filme(1, "Chapeuzinho Vermelho", 2, "Suspense", 1));
        this.tabela.add(new Filme(2, "Deu a louca na chapeuzinho 1", 3, "Acao", 2));
        this.tabela.add(new Filme(3, "Deu a louca na chapeuzinho 2", 4, "Romance", 3));
    }
    
    public FilmeFakeDB(){
        super();
    }
}
