package cinema.fakedb;

import java.util.ArrayList;

import cinema.dominio.Sala;
import cinema.dominio.Sessao;

public class SessaoFakeDB extends BaseGeneriaFakeDB<Sessao> {

    @Override
    protected void CarregarDados() {
        ArrayList<Sala> salas1 = new ArrayList<>();
        ArrayList<Sala> salas2 = new ArrayList<>();
        ArrayList<Sala> salas3 = new ArrayList<>();

        salas1.add(new Sala(1, 15, "Wide-Screen", "C", 1));
        salas2.add(new Sala(2, 20, "Tela de Tubo", "B", 2));
        salas3.add(new Sala(3, 10, "LCD", "A", 3));

        this.tabela.add(new Sessao(1, "lotada", "2023-11-21", "19:00", 1, salas1));
        this.tabela.add(new Sessao(2, "Vazia", "2023-11-20", "15:00", 2, salas2));
        this.tabela.add(new Sessao(3, "Assento livre", "2023-10-11", "8:00", 3, salas3));
    }
    
    public SessaoFakeDB(){
        super();
    }
    
}
