package cinema.fakedb;

import cinema.dominio.FilmesPorAtor;

public class FilmesPorAtorFakeDB extends BaseGeneriaFakeDB<FilmesPorAtor> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new FilmesPorAtor(1, 1, 1));
        this.tabela.add(new FilmesPorAtor(2, 1, 2));
        this.tabela.add(new FilmesPorAtor(3, 1, 3));
        this.tabela.add(new FilmesPorAtor(4, 2, 1));
        this.tabela.add(new FilmesPorAtor(5, 2, 2));
        this.tabela.add(new FilmesPorAtor(6, 2, 3));
        this.tabela.add(new FilmesPorAtor(7, 3, 1));
        this.tabela.add(new FilmesPorAtor(8, 3, 2));
        this.tabela.add(new FilmesPorAtor(9, 3, 3));
    }
    
    public FilmesPorAtorFakeDB(){
        super();
    }
}
