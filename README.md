Relatório

Estrutura da Classe Matriz

Atributos:
matriz: um array bidimensional para armazenar os elementos inteiros.
linhas e colunas: inteiros que armazenam as dimensões da matriz.

Métodos:
preencherMatrizManual(): permite ao usuário preencher a matriz manualmente.
preencherMatrizAleatoria(int limite): preenche a matriz com números aleatórios até um limite definido.
inserirElemento(int linha, int coluna, int valor): insere um elemento na matriz em uma posição específica.
removerElemento(int linha, int coluna): remove um elemento, definindo-o como zero.
exibirMatriz(): exibe a matriz no console.
ordenarPorLinhas(): aplica Bubble Sort em cada linha da matriz.
ordenarPorColunas(): aplica Bubble Sort em cada coluna da matriz.
ordenarMatrizCompleta(): ordena todos os elementos da matriz como um vetor, utilizando Merge Sort.

- Lógica Utilizada nos Métodos -

Ordenação:
O método bubbleSort é usado para ordenar as linhas da matriz de maneira simples, mas menos eficiente para grandes conjuntos de dados.
O mergeSort é usado para ordenar a matriz completa como um vetor, sendo mais eficiente, especialmente em matrizes maiores, devido à sua complexidade O(n log n).
Diferenças entre os Algoritmos de Ordenação

Bubble Sort:
Simples de implementar, mas ineficiente para grandes conjuntos, com complexidade O(n²).
Funciona bem em pequenos conjuntos de dados ou em listas quase ordenadas.

Merge Sort:
Mais complexo, mas mais eficiente em termos de tempo de execução, com complexidade O(n log n).
É um algoritmo estável, o que significa que mantém a ordem dos elementos iguais.
É mais adequado para listas grandes devido ao seu desempenho superior.
Com isso, a classe Matriz está completa e atende a todos os requisitos mencionados! Você pode expandi-la ou ajustá-la conforme necessário para atender a outras necessidades.

