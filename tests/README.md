## Prova 2
1) O cardápio de uma lanchonete é o seguinte:
Código Produto Preço Unitário
1 Cachorro quente R$ 8,00
2 Bauru R$ 9,00
3 Hamburger R$ 12,00
4 Cheeseburger R$ 13,00
5 Refrigerante R$ 5,00
6 Água R$ 3,00
Escreva um programa que leia o código do item pedido e a quantidade comprada, calcule
e apresente o nome do produto e o valor a ser pago pelo lanche. Considere que a cada execução
o cliente só pode pedir um lanche.

2) Faça um programa que leia um conjunto de números reais diferentes de 0 (zero), calcule e
apresente:
- Quantos números foram lidos.
- A soma de todos os números;
- O maior número;
- O percentual de números positivos;
- Quantos números pertencem ao intervalo 1 a 10 (incluindo 1 e 10).
Quando o usuário digitar 0 o programa deve apresentar os resultados e ser finalizado.

3) Faça um programa que leia dois números inteiros positivos (x e n). Caso o usuário digite
um número menor ou igual a 0 para x ou para n, o programa deve solicitar que o usuário digite o
número novamente, até que o valor seja válido. Em seguida, o programa deve calcular e
apresentar o valor de A, que é dado pela seguinte fórmula.

  A = x+(x²/2!)+(x³/3!) ...
  
  ## Prova 3
  
1)  Faça um programa que leia uma matriz quadrada A(n) e seus valores (números inteiros).
Em seguida, o programa deve calcular e apresentar as seguintes informações:
• Soma dos elementos pares da matriz.
• Média dos elementos ímpares da matriz.
• Maior elemento da matriz.
• Quantidade de zeros existentes na matriz.
Crie uma função para leitura da matriz, uma função para calcular e retornar cada um dos itens
solicitados e uma função para apresentar todos os resultados.


2) Algoritmos genéticos são uma área da Inteligência artificial que resolvem problemas
simulando o processo de evolução dos seres vivos. Cada possível solução do problema é
representada por um cromossomo, que nada mais é do que um vetor que pode conter números ou
caracteres, conforme o problema em questão. Um dos principais operadores de um algoritmo
genético é o cruzamento, que mistura os genes de diferentes cromossomos para gerar seus filhos.
Faça um programa que leia os dados dos dois cromossomos pais (cada cromossomo é
representado por um vetor com oito posições que armazena números inteiros). Crie uma função
para ler um cromossomo por vez.
Em seguida, deve-se selecionar o ponto de quebra, a partir do qual os genes dos cromossomos
(valores armazenados no vetor) serão cruzados. O ponto de quebra deve ser um número aleatório
entre 0 e 7. Para gerar números aleatórios em Java, use os comandos abaixo:

Random random = new Random();
int x = random.nextInt(8);

Após selecionar o ponto de quebra o programa deve gerar os cromossomos filhos. Para gerar o
Filho 1, deve-se pegar os elementos das posições 0 até o número sorteado do Pai 1 e os valores
das demais posições do Pai 2. O Filho 2 é gerado com os elementos das posições 0 até o número
sorteado do Pai 2 e os valores das demais posições do Pai 1. A figura abaixo mostra os filhos
gerados pelo cruzamento, considerando que o valor sorteado para o ponto de corte foi 4. Crie uma
função que recebe os dois cromossomos pais lidos, o ponto de quebra sorteado e retorna os dois
cromossomos filhos.

Por fim, o programa deve mostrar os dois cromossomos filhos gerados. Crie uma função que
recebe e apresenta um cromossomo por vez.
