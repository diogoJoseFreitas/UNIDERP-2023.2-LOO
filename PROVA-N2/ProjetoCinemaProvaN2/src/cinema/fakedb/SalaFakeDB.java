package cinema.fakedb;

import cinema.dominio.Sala;

public class SalaFakeDB extends BaseGeneriaFakeDB<Sala>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Sala(1, 15, "Wide-Screen", "C", 1));
        this.tabela.add(new Sala(2, 20, "Tela de Tubo", "B", 2));
        this.tabela.add(new Sala(3, 10, "LCD", "A", 3));
    }
    
    public SalaFakeDB(){
        super();
    }
}
