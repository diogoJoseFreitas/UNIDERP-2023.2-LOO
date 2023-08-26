import com.uniderp.loo.atividade3.Aluno;
import com.uniderp.loo.atividade3.Professor;

public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        
        a1.setNome("Diogo Jose Freitas de Oliveira");
        p1.setNome("Luiz Augusto Rodrigues");

        System.out.println("Aluno: "+ a1.getNome());
        System.out.println("Professor: "+ p1.getNome());

    }
}
