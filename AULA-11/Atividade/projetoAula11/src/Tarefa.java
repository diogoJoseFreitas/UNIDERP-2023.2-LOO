import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa {
    private ArrayList<Integer> lista;
    private Scanner sc;
    public Tarefa(){
         sc = new Scanner(System.in);
         lista = new ArrayList<Integer>();
    }
    
    public void Executar(){

    }

    private void ExecutarOpcao1(){
        int continuar;
        do {
            System.out.println("Informe um número inteiro ou digite 0 para sair: ");
            continuar = this.sc.nextInt();
            if (continuar != 0) {
                this.lista.add(continuar);
            }
            
        } while (continuar != 0);
    }

    private void ExecutarOpcao2(){
        for (Integer num : lista) {
            System.out.println(num);
        }
    }

    private void ExecutarOpcao3(){
        System.out.println("Informe o número da posição a ser consultada: ");
        int num = this.sc.nextInt();
        if (num < lista.size()) {
            int val = lista.get(num);
            System.out.println(val+ "**2 = "+ Math.pow(val, 2));
        } else {
            System.out.println("Posição inválida!");
        }
        
    }

    private void ExecutarOpcao4(){
        int num = lista.get(0);
        int dobro = num * 2;
        int triplo = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("Dobro = "+ dobro);
        System.out.println("Triplo = "+ triplo);
        System.out.println("Raiz quadrada = "+ raiz);
    }

    private void ExecutarOpcao5(){
        int ultimo = lista.size()-1;
        int val = lista.get(ultimo);
        System.out.println("Informe a potência a elevar o último número: ");
        int pot = sc.nextInt();
        System.out.println(Math.pow(val, pot));
    }
}
