# Atividade 3:
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
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </tbody>
    </table>
</div>

----
## Questão 1:
Crie um programa que atenda a especificação dos diagramas abaixo.
![PRINT DO DIAGRAMA]()
> 🗒️**Nota:** As classes indicadas no diagrama UML foram implementadas no projeto Maven [AULA-03\atividade](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/main/AULA-03/atividade)

Dentro do pacote [com/uniderp/loo/atividade3](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/tree/main/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3) foram implementadas as seguintes classes:
- Classe Abstrata [BasePessoa](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/main/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/BasePessoa.java)
- Classe [Professor](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/main/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/Professor.java) extendendo BasePessoa
- Classe [Aluno](https://github.com/diogoJoseFreitas/UNIDERP-2023.2-LOO/blob/main/AULA-03/atividade/src/main/java/com/uniderp/loo/atividade3/Aluno.java) extendendo BasePessoa

A classe BasePessoa é Abstrata, portanto não possui instância de objeto. Seus atributos são todos protegidos para que suas classes filho possam os herdar e todos os Getters e Setters estão devidamente implementados bem como seus construtores.

A Classe Professor extende BasePessoa, pode ter objetos instanciados a partir dela, seus próprios atributos são privados e  todos os Getters e Setters estão devidamente implementados bem como seus construtores.

A Classe Aluno extende BasePessoa, pode ter objetos instanciados a partir dela, seus próprios atributos são privados e  todos os Getters e Setters estão devidamente implementados bem como seus construtores.