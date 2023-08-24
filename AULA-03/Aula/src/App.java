import java.time.LocalDate;

import uniderp.loo.escola.dominio.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setNome("Diogo");
        c1.setEndereco("Rua dos Bobos, 0");
        c1.setDataNascimneto(LocalDate.of(2003, 9, 11));
        c1.setTelefone("556799999999");
        c1.setRg("15258468");
        c1.setCpf("10245896514");
        c1.setDataInsercao(LocalDate.now());
    }
}
