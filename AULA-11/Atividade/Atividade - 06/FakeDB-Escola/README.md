# Atividade 06

LOO - Atividade A2 - Atividade Enunciado
| Aluno | CPF| 
| :- | :-: |
| Carlos Eduardo Baraúna Recalde da Silva | 056.595.611-60 |
|  Diogo José Freitas de Oliveira | 040.733.651-69 |

## Questão
**Modalidade:** Programa desenvolvido em Linguagem Java  
**Tema:** Aplicando conceitos de POO e técnicas de programação.  

**Orientações:**  
Crie um programa em Linguagem Java, usando POO, que:
-  Implemente uma classe Aluno, contendo código(int), nome(string), nota A1(double), nota P1(double), nota A2(double), nota P2(double), média (double).
- Desenvolva uma função para exibir um menu com as opções:
    - Opção 1 – Gerenciar Alunos:
        - Opção 1 – Adicionar Aluno (informar apenas o código e o nome).
        - Opção 2 – Alterar nome do Aluno.
        - Opção 3 – Excluir Aluno.
        - Opção 4 – Listar todos.
        - Opção 5 – Selecionar um aluno da lista, para:
          - Opção 1 – Adicionar a nota A1 do aluno selecionado.
          - Opção 2 – Adicionar a nota P1 do aluno selecionado.
          - Opção 3 - Adicionar a nota A2 do aluno selecionado.
          - Opção 4 - Adicionar a nota P2 do aluno selecionado.
          - Opção 5 - Calcular a Média do Aluno (usando a fórmula abaixo), exibir o resultado, e se o aluno foi aprovado ou reprovado.
          - Média = ( ((P1 + A1)/2) + ((P2 + A2)/2) )/ 2.
    - Opção 2 – Rendimento Escolar:
      - Opção 1 – Selecionar um aluno da lista, para:
        - Exibir as notas de prova, de atividade e a média.
      - Opção 2 – Exibir rendimento da turma (a lista toda, exibir as notas de prova, de atividade e a média).
    - Opção 9 - Sair, finalizando o programa.
  - Modalidade: Trabalho em dupla.
  - Avaliação:
    - Apresentação do código, na data de entrega.
    - 01/11/2023
  - Pontuação:
    - Nota de Apresentação em dupla.
      - Até 2500 pontos de Atividade A2.
    - Nota de Apresentação Individual (questionamentos).
      - Até 1000 pontos na Prova N2.

---
## Desenvolvimento
Ao analisar a estrutura do menu é possível abstrair os seguintes modos de interação com Objetos:
>- Interações com Aluno:
>     - Alterar nome ou nota.
>     - Calcular média.
>- Interações com Turma:
>     - Adicionar Aluno.
>     - Listar Alunos.
>     - Excluir Aluno.
>     - Selecionar Aluno.
>- Relatório por Aluno:
>     - Rendimento Escolar Individual.
>- Relatório por Turma:
>     - Rendimento Escolar Geral.



