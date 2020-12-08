# Exercícios em Java

## Lista 3.1

1) Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. Além disto, o programa deve mostrar uma mensagem indicando se a residência
está com consumo elevado de energia. A empresa considera consumo elevado de
energia, se a residência consumir mais de de 70 quilowatts.
O programa deve apresentar a mensagem “Consumo elevado de energia”, caso o
consumo seja elevado, ou “Você é um consumidor consciente”, caso o consumo não seja
elevado.

2) O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
O programa deve apresentar a mensagem “Parabéns, você foi aprovado” ou
“Infelizmente, você não foi aprovado”, de acordo com as notas do aluno.
3) Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
.
Além do IMC, o programa deve mostrar a situação da pessoa, de acordo com o seu IMC:
• Abaixo de 20 – magro;
• Entre 20 e 24,99 – normal;
• Entre 25 e 30 – sobrepeso;
• Acima de 30 – obeso.

4) Faça um programa que leia um número inteiro N e apresente uma mensagem
indicando se N é par ou ímpar.
5) Faça um progrma que leia um número inteiro N e imprima “F1”, “F2” ou “F3”, conforme
a condição:
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100
• “F3”, se n > 100

6) Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.

7) Faça um programa que leia três valores inteiros e os imprima em ordem crescente.

8) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários das categorias A e H ganharão 10% de aumento sobre o salário;
• Funcionários das categorias B, D, e E ganharão 15% de aumento sobre o salário;
• Funcionários das categorias C e F ganharão 25% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia o nome do funcionário, sua categoria e salário atual e
imprima o seu nome, categoria e salário reajustado.

9) Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
negativo, deve ser mostrada, também, a mensagem “conta estourada”.

10) Faça um programa que leia três valores X, Y e Z e verifique se eles podem ser os
comprimentos dos lados de um triângulo, e se forem, deve verificar se é um triângulo
equilátero, isóscele ou escaleno. Se eles não formarem um triângulo, o programa deve
escrever uma mensagem indicando.
Propriedade – o comprimento de cada lado de um triângulo é menor do que a
soma dos comprimentos dos outros dois lados.
Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos três lados
iguais;
Definição 2 - chama-se de triângulo isóscele o triângulo que tem os comprimentos de
dois lados iguais;
Definição 3 - chama-se triângulo escaleno o triângulo que tem os comprimentos dos três
lados diferentes.

## Lista 3.2

1) Faça um programa que mostre na tela todos os números inteiros entre 1 e 100.
2) Faça um programa que mostre na tela todos os números inteiros entre 55 e 118.
3) Faça um programa que leia um número inteiro e apresente a sua tabuada.
4) Para uma turma de 45 alunos, construa um programa que leia a idade e a altura de
cada aluno e determine:
a) Quanto alunos tem menos de 18 anos;
b) A idade média dos alunos com menos de 1,70m de altura;
c) A altura média dos alunos com mais de 20 anos.
5) Um hotel cobra R$ 80,00 por diária e mais uma taxa de serviços, que é de:
• R$ 14,00 por diária, se o número de diárias for < 10;
• R$ 12,50 por diária, se o número de diárias for = 10;
• R$ 10,00 por diária, se o número de diárias for > 10.
Faça um programa que leia quantos hóspedes estão saindo do hotel no dia, o
nome e a quantidade de diárias de cada hóspede. Este programa deve calcular e imprimir
o nome e o valor da conta de cada cliente do hotel. O programa deve imprimir também o
total a ser recebido pelo hotel neste dia.
6) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários da categoria A ganharão 10% de aumento sobre o salário;
• Funcionários da categoria B ganharão 12% de aumento sobre o salário;
• Funcionários da categoria C ganharão 14% de aumento sobre o salário;
• Funcionários da categoria D ganharão 16% de aumento sobre o salário;
• Funcionários da categoria E ganharão 18% de aumento sobre o salário;
• Funcionários da categoria F ganharão 20% de aumento sobre o salário;
• Funcionários da categoria G ganharão 22% de aumento sobre o salário;
• Funcionários da categoria H ganharão 24% de aumento sobre o salário;
• Funcionários da categoria I ganharão 26% de aumento sobre o salário;
• Funcionários da categoria J ganharão 28% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia quantos funcionários a empresa possui, o nome de
cada funcionário, sua categoria e salário atual e imprima, para cada funcionário, o seu
nome, categoria e salário reajustado.
7) Faça um programa que mostre na tela os números ímpares entre 1 e 100.
8) Escreva um programa que determine o fatorial de um número inteiro. Para este
problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O
fatorial de 0 é igual a 1. O fatorial de um número N é definido conforme a seguir:
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

## Lista 3.3

2) Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
- Quantos números foram digitados (exceto o 0);
- A soma de todos os números;
- A média de todos os números.
3) Melhore o programa da questão 2 para que ele não aceite que o usuário digite valores
menores que 0. Quando isto acontecer, o programa deve solicitar que o usuário digite
novamente o valor.
4) Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
- O maior número digitado;
- O menor número digitado.
5) Faça um programa que funcione de forma semelhante a um menu. O programa deve
apresentar as opções abaixo na tela e solicitar que o usuário digite a opção desejada:
1 – Inclusão de cliente.
2 – Alteração de cliente.
3 – Exclusão de cliente.
4 – Visualização de cliente.
5 – Sair.
Quando o usuário digitar um valor entre 1 e 4, o programa deve apresentar uma
mensagem na tela com a função selecionada e apresentar o menu novamente. Se o
usuário digitar 5, o programa deve ser encerrado. Se o usuário digitar qualquer outro
valor, o programa deve mostrar a mensagem "Opção inválida" e apresentar o menu
novamente.
6) Considere que para cada aluno de uma universidade, tenha-se as seguintes
informações: nome do aluno, renda mensal da família, gasto com alimentação, gasto com
aluguel e outros gastos. Faça um programa que leia estes dados, calcule e apresente:
a) Para cada aluno:
- Seu gasto total;
- A proporção de gastos com alimentação em relação a sua renda;
- A proporção de gastos com aluguel em relação a sua renda;
b) O gasto médio com alguel.
c) O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00.
O programa deve ler e processar a ficha de um aluno e no final perguntar se
deseja-se registrar mais algum aluno (SIM ou NÃO).
7) Suponha que a cidade A possui 120 mil habitantes e a cidade B possui 80 mil
habitantes. A população da cidade A cresce a uma taxa de 1,5% ao ano e a cidade B a
uma taxa de 3,5% ao ano. Faça um programa que calcule e apresente em quantos anos a
população da cidade B vai ultrapassar a população da cidade A.
8) Faça um programa que leia um número inteiro positivo (N), calcule e apresente o valor
de A, que é dado pela seguinte fórmula:
9) A série de Fibinacci é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13 ...
Crie um programa que leia um número inteiro N (entre 3 e 20) e apresente a série de
Fibonacci até o enésimo termo. Se o número digitado pelo usuário não estiver entre o
intervalo 3 e 20 (inclusive), o programa deve solicitar que ele digite outro número.
10) Uma empresa está cadastrando os candidatos a emprego. Cada candidato preencheu
uma ficha onde estão registrados os seguintes dados: nome, gênero (M, F ou I), idade e
experiência no serviço (S ou N).
Faça um programa que leia estes dados, calcule e apresente:
a) A quantidade de candidatos de cada gênero;
b) A quantidade de candidatos com experiência no serviço;
c) A quantidade de candidatos sem experiência no serviço;
d) A idade média dos candidatos com experiência no serviço;
e) A idade média dos candidatos sem experiência no serviço;
f) O percentual de candidatos com experiência no serviço e idade inferior a 35 anos;
g) A idade do candidato mais jovem.
O programa deve ser repetido até que o usuário digite FIM como nome do candidato.
Neste caso, não se deve perguntar as demais informações do candidato.
