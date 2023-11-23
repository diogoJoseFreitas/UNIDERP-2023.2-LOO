import cinema.fakedb.AtorFakeDB;
import cinema.fakedb.FilmeFakeDB;
import cinema.fakedb.FilmesPorAtorFakeDB;
import cinema.fakedb.IngressoFakeDB;
import cinema.fakedb.SalaFakeDB;
import cinema.fakedb.SessaoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        AtorFakeDB atoresDB = new AtorFakeDB();
        FilmeFakeDB filmesDB = new FilmeFakeDB();
        FilmesPorAtorFakeDB filmesPorAtorDB = new FilmesPorAtorFakeDB();
        IngressoFakeDB ingressosDB = new IngressoFakeDB();
        SalaFakeDB salasDB = new SalaFakeDB();
        SessaoFakeDB sessoesDB = new SessaoFakeDB();

        atoresDB.Listar();
        filmesDB.Listar();
        filmesPorAtorDB.Listar();
        ingressosDB.Listar();
        salasDB.Listar();
        sessoesDB.Listar();
        
    }
}
