# Atividade 3:
|**Aluno:**|Diogo José Freitas de Oliveira|
|-|-|
|**RA:**|126641313114|
|**Curso:**|Engenharia da Copmutação - N (4º Semestre)|
|**Matéria**|**Linguagem Orientada a Objetos**|

<div style = "display: flex; justify-content: center">
    <table>
        <thead>
            <tr>
                <th colspan = 6 style = "text-align: center">RESUMO</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>QUESTÃO</th>
                <th>1</th>
                <th>2</th>
                <th>3</th>
                <th>4</th>
                <th>5</th>
            </tr>
            <tr>
                <th>RESPOSTA</th>
                <th>-</th>
                <th>A</th>
                <th>A</th>
                <th>C</th>
                <th>B</th>
            </tr>
        </tbody>
    </table>
</div>

----
## Questão 1:
Crie um programa que atenda a especificação dos diagramas abaixo.<br>
![PRINT DO DIAGRAMA](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/main/AULA-03/atividade/LOO%20-%20Atividade%2003%20-%20Quest%C3%A3o%2001%20-%20R01.png)
> 🗒️**Nota:** As classes indicadas no diagrama UML foram implementadas no projeto Maven [AULA-03\atividade](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/main/AULA-03/atividade)

Dentro do pacote [com/uniderp/loo/atividade3](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/main/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3) foram implementadas as seguintes classes:
- Classe Abstrata BasePessoa:
>A classe BasePessoa é Abstrata, portanto não possui instância de objeto. Seus atributos são todos protegidos para que suas classes filho possam os herdar e todos os Getters e Setters estão devidamente implementados bem como seus construtores.
<https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/921d17a9e9f5db43495e405ac1bab6e1b1ca44f6/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/BasePessoa.java#L1-L78>
- Classe Professor:
>A Classe Professor extende BasePessoa, pode ter objetos instanciados a partir dela, seus próprios atributos são privados e  todos os Getters e Setters estão devidamente implementados bem como seus construtores.
<https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/9e089f0e0516f847aaf0741c80d795ed3e939451/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/Professor.java#L1-L29>
- Classe Aluno:
>A Classe Aluno extende BasePessoa, pode ter objetos instanciados a partir dela, seus próprios atributos são privados e  todos os Getters e Setters estão devidamente implementados bem como seus construtores.
<https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/9e089f0e0516f847aaf0741c80d795ed3e939451/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/Aluno.java#L1-L29>

# Questão 2:
Considere o trecho de código abaixo.  
<https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/55a15b04cf8c6dfe2d8540c9d790ea2d6d4f091c/AULA-03/atividade/questao%2002/questao%2002.java#L1-L51>

Marque a alternativa correta nas afirmações abaixo:  
***A) Todas as instâncias de classe podem ser inicializadas corretamente.***  
B) A propriedade setId(), da classe “Classe”, se não existir, não irá gerar erro de 
compilação.  
C) É correto considerar todas as classes representadas como instanciáveis, segundo os 
conceitos de Orientação a Objeto.  
D) É incorreto afirmar que a classe "Produto" herda atributos e propriedades das outras 
classes.  
E) O código está semanticamente incorreto, e compilará sem erros ou avisos.  

Foi considerada a alternativa **A** levando em consideração a ciência de que classes abstratas **não** recebem instanciamento. Em segunda opção a alternativa B poderia estar correta caso existisse a propriedade citada na classe "Classe".
