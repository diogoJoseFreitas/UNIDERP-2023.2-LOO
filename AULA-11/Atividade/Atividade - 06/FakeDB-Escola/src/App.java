import java.util.Scanner;

import com.uniderp.projetoescola.FakeDB.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();
        int opcao;
        String menu = "\n\n"+
        "1- Gerenciar Alunos\n"+
        "2- Rendimento Escolar\n"+
        "9- Sair\n\n";
        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1");
                    turma.menuGerenciarAlunos();
                    
                    break;
                case 2:
                    System.out.println("Opção 2");
                    turma.menuRendimentoEscolar();
                    
                    break;
                case 9:
                    System.out.println("Encerrando Programa...");
                    
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 9);
    }
}
