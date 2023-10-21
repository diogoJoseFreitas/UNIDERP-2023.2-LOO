import java.util.Scanner;

import com.uniderp.projetoescola.FakeDB.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();
        int opcao;
        String menu = "\n\n1- Gerenciar Alunos\n2- Rendimento Escolar\n9- Sair\n\n";
        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1");
                    
                    break;
                case 2:
                    System.out.println("Opção 2");
                    
                    break;
                case 9:
                    System.out.println("Opção 9");
                    
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 9);
    }
}
