import java.time.LocalDate;

import com.uniderp.airlines.system.models.Funcionario;
import com.uniderp.airlines.system.models.FuncionarioTerceirizado;
import com.uniderp.airlines.system.models.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario f1 = new Funcionario(
            1, 
            "Pedro Henrique Gonçalves", 
            "pedrinhoreidelas@gamil.com", 
            "556792345678", 
            LocalDate.of(2003, 9, 11), 
            "1785946", 
            "pedro.goncalves", 
            "Senha123!", 
            "172569-5", 
            "227"
            );

        Passageiro p1 = new Passageiro(
            2, 
            "Tarsila do Amaral", 
            "amaraltarsila@gamil.com", 
            "556792345679", 
            LocalDate.of(2005, 6, 1), 
            "1758234", 
            "tarsila.amaral", 
            "Senha123!", 
            0, 
            "228"
            );
        
            FuncionarioTerceirizado ft1 = new FuncionarioTerceirizado(
                3, 
                "Ana Paula de Oliveira", 
                "oliveirapaula@gamil.com", 
                "5567923456790", 
                LocalDate.of(2003, 4, 5), 
                "1864123", 
                "Top Clean Limpezas Terceirizadas"
                );
            System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
            System.out.println(
                "Bom dia, "+p1.getNome()+
                "!\nObrigado por viajar com a Uniderp Airlines. S2\n\nSeu piloto(a) serah "+ f1.getNome()+
                ".\n\nTodos da Uniderp Airlines desejamos uma Otima experiencia."+
                "\nQualquer problemas que tiver quanto a limpeza e outros afins, apenas mande mensagem para "+ft1.getNome()+
                " através do telefone "+ft1.getTelefone()+
                ".\nAté mais."
                );
            System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");

    }
}
