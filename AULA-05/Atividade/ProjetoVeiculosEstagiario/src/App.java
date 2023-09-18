import com.uniderp.veiculos.models.BaseVeiculo;
import com.uniderp.veiculos.models.ModeloVeiculo;
import com.uniderp.veiculos.models.VeiculosAeros.Aviao;
import com.uniderp.veiculos.models.VeiculosTerrestres.Caminhao;
import com.uniderp.veiculos.models.VeiculosTerrestres.Carro;
import com.uniderp.veiculos.models.VeiculosTerrestres.Motocicleta;

public class App {
    public static void padraoImpressao(BaseVeiculo veiculo){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        veiculo.imprimir();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void main(String[] args) throws Exception {
        ModeloVeiculo modeloCarro = new ModeloVeiculo(
            "Mercedes",
            "Classe C",
            2023,
            1500,
            "Carro de Passeio",
            5,
            4,
            4,
            2.2,
            "Mercedes Bens",
            "Flex",
            1);

        ModeloVeiculo modeloCaminhao = new ModeloVeiculo(
            "Scania",
            "R450",
            2023,
            12000.0,
            "Caminhão",
            2, 
            2, 
            10, 
            450.0, 
            "Scania Group",
            "Diesel", 
            1);

        ModeloVeiculo modeloMotocicleta = new ModeloVeiculo(
            "Honda", 
            "CBR1000RR", 
            2023,
            200.0, 
            "Motocicleta",
            2, 
            0, 
            2, 
            190.0, 
            "Honda Motor Co., Ltd.", 
            "Gasolina", 
            1);

        ModeloVeiculo modeloAviao = new ModeloVeiculo(
            "Boeing", 
            "747", 
            2022, 
            400000.0, 
            "Avião",
            500, 
            2, 
            18, 
            56000.0, 
            "The Boeing Company", 
            "Querosene de Aviação", 
            4);

        Aviao aviao01 = new Aviao(
            1, 
            "Meu Avião", 
            modeloAviao, 
            "Branco", 
            2023, 
            560000.0,
            "Tio Patinhas", 
            "MG", 
            "Ouro Preto", 
            350, 
            "ABC123", 
            "Jhonder");
        padraoImpressao(aviao01);

        Aviao aviao02 = new Aviao(
            2, 
            "Avião Dele", 
            modeloAviao, //Aplicando esse conceito os itens podem ser reutilizados em mais de um objeto, permitindo até a otimização no caso da implementação de um futuro fakeDB
            "Azul", 
            2022, 
            565000.0,
            "Tony Stark", 
            "AC", 
            "Rio Branco", 
            350, 
            "ABC124", 
            "Jarvis");
        padraoImpressao(aviao02);

        Carro carro01 = new Carro(
            3, 
            "Meu Carro", 
            modeloCarro, 
            "Prata", 
            2023, 
            1500.0,
            "Shazam", 
            "DF", 
            "Brasília", 
            5, 
            "ABC123456", 
            "XYZ-1234", 
            2, 
            "123456789", 
            true);
        padraoImpressao(carro01);
        
        Caminhao caminhao01 = new Caminhao(
            4, 
            "Optmus Prime", 
            modeloCaminhao, 
            "Azul", 
            2023, 
            12000.0,            
            "H&H Veículos", 
            "SP", 
            "São Paulo", 
            2, 
            "XYZ987654", 
            "XYZ-5678", 
            6, 
            "987654321", 
            2);
        padraoImpressao(caminhao01);

        Motocicleta motocicleta01 = new Motocicleta(
            5, 
            "Motoquinha", 
            modeloMotocicleta, 
            "Vermelha", 
            2023, 
            200.0,        
            "Peterson", 
            "RJ", 
            "Rio de Janeiro", 
            2, 
            "DEF654321", 
            "DEF-4321", 
            2, 
            "456789012", 
            true);
        padraoImpressao(motocicleta01);


    }
    }
