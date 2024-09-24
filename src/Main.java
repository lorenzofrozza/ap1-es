public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(0,0);
        matriz.definirDimensoes();
        matriz.preencherMatrizAleatoria(100);

        System.out.println("\nMatriz Original:");
        matriz.exibirMatriz();

        matriz.inserirElemento(1, 1, 99);
        matriz.removerElemento(0,0);
        System.out.println("Matriz apos a inserção e remoção:");
        matriz.exibirMatriz();


        matriz.ordenarPorLinhas();
        System.out.println("Matriz Ordenada por Linhas:");
        matriz.exibirMatriz();

        matriz.ordenarPorColunas();
        System.out.println("Matriz Ordenada por Colunas:");
        matriz.exibirMatriz();

        matriz.ordenarMatrizCompleta();
        System.out.println("Matriz Ordenada como Vetor:");
        matriz.exibirMatriz();
    }
}