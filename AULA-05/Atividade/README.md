# Atividade 5
---
## Questão 1  
O estagiário (mais uma vez) começou abstraindo um diagrama de Classes de Veículos, mas novamente deixou para você realizar o trabalho dele. Desta vez, tudo o que ele pensou foram os atributos dos veículos. Porém, parece que ele não colocou a nomenclatura sugerida, não distribuiu os atributos, e relacionou Classes cujos atributos não aparecem. 
Usando  o  que  você  aprendeu  em  POO,  análise  os  atributos,  distribua  nas Classes  relacionadas,  reajustando  atributos  quando  necessário,  e  crie  o  diagrama  de Classes no draw.io, salvando o resultado em PDF.  
Após isso, crie um projeto Java chamado `ProjetoVeiculosEstagiario`, codifique as  Classes  que  você  criou  no  diagrama,  publique  no  GitHub,  e  mande  o  link  para  o professor.  
![UML - Veículos - Estagiário](docs/UML%20-%20Veiculos%20-%20Estagiário.png)

## Resposta:

### Análise:
Como é possível perceber no diagrama do estágiário, foi realizado apenas o levantamento das prováveis Classes e atributos necessários para o desenvolvimento do modelo que seja capaz de suprir as necessidades do modelo de negócio, faltando ainda determinar as características devidas de cada Classe, a organização e hierarquia entre elas bem como a usabiliade de seus atributos.  
Interpretando os nomes das Classes podemos presumir uma hierarquia onde todas as outras Classes possuem características de `Veiculo`, ou seja, esta é uma Classe pai e não devem ser instanciados objetos diretamentde desta Classe, apenas de seus filhos.  
Observando agora os atributos podemos perceber que a maioria deles podem ser atribuidos a todas as Classes filhas neste modelo, devendo então ser implementadas na Classe pai e que existem outras que podem ser comuns a mais de uma Classe filha mas não em todos.

---
### Intervenções:
 - Por boas práticas, toda Classe pai (abstrata) deve conter no início de seu nome a palavra "Base", portanto a Classe `Veiculo` pasará a ser `BaseVeiculo`.
 - `BaseVeiculo` irá conter todos os atributos comuns entre todas as Classes reais.
 - Por boas práticas e para manter a coesão do código, todos os atributos que envolvem algum tipo quantitativo de dado deverá conter a palavra `qtde` no seu começo, facilitando interpretações futuras.
 - Para aumentar a usabilidade do código, foi implementada uma Classe Real `ModeloVeiculo` contendo atributos comuns a veículos diferentes mas de mesmo modelo, como `anoModelo`, `marca` e entre outros (uso demosntrado em [App.java](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/main/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/App.java)).
 - Os atributos comuns a apenas algumas Classes Reais demonstram uma separação intuitiva entre veículos aéreos e terrestres, onde atributos como `placa`, `chassi`, `codigoRenavam`, entre outros se enquadram apenas em veículos terrestres, criando assim a Classe Abstrata `BaseVeiculoTerrestre` e por organização foi implementada também a Classe Abstrata `BaseVeiculoAereo` contendo a documentação devida de veículos aéreos (atriburo `registroAeronaltico`).
 - Por fim, para justificar a criação de diferentes objetos como Carros, Caminhões, Motocicletas e Ônibus ao invés de generalizar apenas em Veículo Terrestre tomei a liberdade de validar a presença de itens específicos de cada objeto, como sensor de ré para Carro, bagageiro para Motocicleta, articulação em sanfona para Ônibus e a quantidade de engates para Caminhões.
 - Para facilitar visualização dos dados inseridos foi desenvolvida a Interface `iImpressao` que será implementada desde a Classe `BaseVeiculo` e irá sendo sobrescrita com os atributos de cada classe sucessora, permitindo uma implementação mais coesa e organizada.

### Diagrama de Caso de Uso Corrigido:
A seguir uma possível visualização da abstração das intervenções citadas acima:  
![Visualização do UML](docs/UML%20-%20Veiculos.drawio.png)

### ProjetoVeiculosEstagiario:
Na pasta [`ProjetoVeiculosEstagiario`](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/8f361a11093e0a6fb8eb96067e9948a8fa268669/AULA-05/Atividade/ProjetoVeiculosEstagiario) está o projeto da atividade proposta.  
No pacote [`com.uniderp.veiculos`](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/8f361a11093e0a6fb8eb96067e9948a8fa268669/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos) todas as implementações realizadas foram separados por [modelos](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/8f361a11093e0a6fb8eb96067e9948a8fa268669/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models) e [serviços](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/8f361a11093e0a6fb8eb96067e9948a8fa268669/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/services), onde em `models` se encontram todas as classes desenvolvidas em acordo com o Diagrama e em `services` se encontra apenas a interface `IImpressão`.

- Interface `IImpressão`:
  - Contempla apenas a exigência da implementação da função `imprimir()` que será sobrescrita em cada Classe implementada para imprimir seus atributos juntos aos de sua Classe superior.<br>
 <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/0414d4eaf6a3e6fa30363811210f05f1156fd001/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/services/iImpressao.java#L1-L5>