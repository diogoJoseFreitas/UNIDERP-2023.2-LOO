import java.util.Scanner;
public class Exemplo {
    private Scanner scan;
    public Exemplo(){
        this.scan = new Scanner(System.in);
    }
    public void Executar(){
        this.ExibirMenu();
    }
    private void ExibirMenu(){
        int continuar = 99;
        do
        {
            System.out.println("\n\tChat Forever Alone\n\n");
            System.out.println("1. Oi\n");
            System.out.println("2. Tudo bem\n");
            System.out.println("3. Como vai a familia\n");
            System.out.println("0. Sair\n");
            continuar = this.scan.nextInt();
            switch(continuar)
            {
                case 1:
                    this.Oi();
                    break;
                case 2:
                    this.TudoBem();
                    break;
                case 3:
                    this.Familia();
                    break;
                case 0:
                    this.Sair();
                    break;
                default:
                    System.out.println("Digite uma opção válida\n");
            }
        } while(continuar != 0);        
    }

private void Oi()
    {
        System.out.println("Oi!\n");
    }
    private void TudoBem()
    {
        System.out.println("Tudo ótimo, e com você?\n");
    }
    private void Familia()
    {
        System.out.println("Meus bits...digo, minha família vai bem!\n");
    }
    private void Sair()
    {
        System.out.println("Já vai??? Não! Não! Espere! Naa...\n");
    }    
}
    