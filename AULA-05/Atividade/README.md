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
Observando agora os atributos podemos perceber que a maioria deles podem ser atribuidos a todas as Classes filhas neste modelo, devendo então ser implementadas na Classe pai e que existem outras que podem ser comuns a mais de uma Classe filha mas não em todas.

---
### Intervenções:
 - Por boas práticas, toda Classe pai (abstrata) deve conter no início de seu nome a palavra "Base", portanto a Classe `Veiculo` pasará a ser `BaseVeiculo`.
 - `BaseVeiculo` irá conter todos os atributos comuns entre todas as Classes reais.
 - Por boas práticas e para manter a coesão do código, todos os atributos que envolvem algum tipo quantitativo de dado deverá conter a palavra `qtde` no seu começo, facilitando interpretações futuras.
 - Para aumentar a usabilidade do código, foi implementada uma Classe Real `ModeloVeiculo` contendo atributos comuns a veículos diferentes mas de mesmo modelo, como `anoModelo`, `marca` e entre outros (uso demosntrado em [App.java](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/e08e1519deb62d31680954760fc36d319bfbb400/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/App.java#L1-L157)).
 - Os atributos comuns a apenas algumas Classes Reais demonstram uma separação intuitiva entre veículos aéreos e terrestres, onde atributos como `placa`, `chassi`, `codigoRenavam`, entre outros se enquadram apenas em veículos terrestres, criando assim a Classe Abstrata `BaseVeiculoTerrestre` e por organização foi implementada também a Classe Abstrata `BaseVeiculoAereo` contendo a documentação devida de veículos aéreos (atriburo `registroAeronaltico`).
 - Por fim, para justificar a criação de diferentes objetos como Carros, Caminhões, Motocicletas e Ônibus ao invés de generalizar apenas em Veículo Terrestre tomei a liberdade de validar a presença de itens específicos de cada objeto, como sensor de ré para Carro, bagageiro para Motocicleta, articulação sanfonada para Ônibus e a quantidade de engates para Caminhões.
 - Para facilitar visualização dos dados inseridos foi desenvolvida a Interface `IImpressao` que será implementada desde a Classe `BaseVeiculo` e irá sendo sobrescrita com os atributos de cada classe sucessora, permitindo uma implementação mais coesa e organizada.

---

### Diagrama de Caso de Uso Corrigido:
A seguir uma possível visualização da abstração das intervenções citadas acima:<br>

![Visualização do UML](docs/UML%20-%20Veiculos.drawio.png)

---

### Implementação do código:
Na pasta [`ProjetoVeiculosEstagiario`](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/16b863efe00ead3a79bab7d92aa930b4257ef308/AULA-05/Atividade/ProjetoVeiculosEstagiario) foi desenvolvido o projeto da atividade proposta.  
No pacote [`com.uniderp.veiculos`](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/16b863efe00ead3a79bab7d92aa930b4257ef308/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos) todas as implementações realizadas foram separadas por [modelos](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/16b863efe00ead3a79bab7d92aa930b4257ef308/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models) e [serviços](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/16b863efe00ead3a79bab7d92aa930b4257ef308/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/services), onde em `models` se encontram todas as classes desenvolvidas em acordo com o Diagrama e em `services` se encontra apenas a interface `IImpressao`.

<table>
<thead>
  <tr>
    <th style = "text-align:center" colspan="2">RESUMO</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>
    Interface
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/16b863efe00ead3a79bab7d92aa930b4257ef308/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/services/iImpressao.java'> IImpressao</a>
    </td>
    <td>Interface para exigir o uso da função imprimir().</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/BaseVeiculo.java#L1-L113'> BaseVeiculo</a>
    </td>
    <td>Abstrata, implementa e sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/ModeloVeiculo.java#L1-L148'> ModeloVeiculo</a>
    </td>
    <td>Real, implementa e sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosAeros/BaseVeiculoAereo.java#L1-L31'> BaseVeiculoAereo</a>
    </td>
    <td>Abstrata, estende BaseVeiculo, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/e08e1519deb62d31680954760fc36d319bfbb400/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/BaseVeiculoTerrestre.java#L1-L53'> BaseVeiculoTerrestre</a>
    </td>
    <td>Abstrata, estende BaseVeiculo, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosAeros/Aviao.java#L1-L30'> Aviao</a>
    </td>
    <td>Abstrata, estende BaseVeiculoAereo, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Caminhao.java#L1-L30'> Caminhao</a>
    </td>
    <td>Abstrata, estende BaseVeiculoTerrestre, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Carro.java#L1-L30'> Carro</a>
    </td>
    <td>Abstrata, estende BaseVeiculoTerrestre, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Motocicleta.java#L1-L30'> Motocicleta</a>
    </td>
    <td>Abstrata, estende BaseVeiculoTerrestre, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Onibus.java#L1-L30'> Onibus</a>
    </td>
    <td>Abstrata, estende BaseVeiculoTerrestre, sobrescreve IImpressao.</td>
  </tr>
  <tr>
    <td>
    Classe
    <a href = 'https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/e08e1519deb62d31680954760fc36d319bfbb400/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/App.java#L1-L157'> App</a>
    </td>
    <td>Exemplo de aplicação do modelo</td>
  </tr>
</tbody>
</table>

---

- Interface `IImpressão`:
  - Contempla apenas a exigência da implementação da função `imprimir()` que será sobrescrita em cada Classe implementada para imprimir seus atributos juntos aos de sua Classe superior.<br>
 <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/services/iImpressao.java#L1-L5>

---

- Classe `BaseVeiculo`:
  - Implementa `IImpressao` e um de seus atributos é um objeto do tipo `ModeloVeiculo`, também implementado no pacote de modelos, é abstrata e sobrescreve o método `imprimir()` para já informar os dados pertencentes a esta Classe.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/BaseVeiculo.java#L1-L113>

---

- Classe `ModeloVeiculo`:
  - Serve para armazenar atributos que tendem a ser iguais entre veículos similares, ou seja, o modelo de um veículo define certas características deste assim como a Classe define as propriedades possíveis para suas instâncias.
  - Implementa `IImpressao` e sobrescreve método `imprimir()` para exibir os dados nela inseridos e é uma Classe Real, tendo em vista que deve ser instanciada para ser inserida em objetos herdeiros de `BaseVeiculo`.
  - Exemplo de Caso de Uso (não implementado): Criação de uma tabela secundária em um FakeDB para simular uma relação entre tabelas que pode otimizar armazenamento e evitar duplicação de Dados.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/ModeloVeiculo.java#L1-L148>

---

- Classe `BaseVeiculoAereo`:
  - Armazena documentação válida e necessária para registro de um veículo Aéreo, `registroAeronaltico`.
  - Sobrescreve método `imprimir()` para que exiba também seus dados, Classe Abstrata.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosAeros/BaseVeiculoAereo.java#L1-L31>

---

- Classe `BaseVeiculoTerrestre`:
  - Contém atribiutos comuns a todos e apenas a Veículos Terrestres.
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe abstrata, estende `BaseVeiculo`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/e08e1519deb62d31680954760fc36d319bfbb400/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/BaseVeiculoTerrestre.java#L1-L53>
  
---

- Classe `Aviao`:
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe Real, estende `BaseVeiculoAereo`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosAeros/Aviao.java#L1-L30>
  
---

- Classe `Caminhao`:
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe Real, estende `BaseVeiculoTerrestre`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Caminhao.java#L1-L30>
  
---

- Classe `Carro`:
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe Real, estende `BaseVeiculoTerrestre`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Carro.java#L1-L30>
  
---

- Classe `Motocicleta`:
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe Real, estende `BaseVeiculoTerrestre`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Motocicleta.java#L1-L30>
  
---

- Classe `Onibus`:
  - Sobrescreve `imprimir()` para exibir também seus dados, Classe Real, estende `BaseVeiculoTerrestre`.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/2dfcc45e7add985a779035b9eedcf8c02a76f933/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/com/uniderp/veiculos/models/VeiculosTerrestres/Onibus.java#L1-L30>
  
---

- Classe `App`:
  - Exemplo de execução do código, possui exemplo de reutilização de `ModeloVeiculo` em `aviao01` e `aviao02`.
  - Possui também a instancia de um modelo para cada Classe Real e a instancia de ao menos um objeto para cada Classe Final.<br>
  <https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/e08e1519deb62d31680954760fc36d319bfbb400/AULA-05/Atividade/ProjetoVeiculosEstagiario/src/App.java#L1-L157>