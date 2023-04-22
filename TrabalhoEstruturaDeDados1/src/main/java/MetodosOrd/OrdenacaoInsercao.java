package MetodosOrd;

public class OrdenacaoInsercao {
    public static int[] ordenar(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 1; i < tamanho; i++) {
            int valorAtual = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > valorAtual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = valorAtual;
        }

        return vetor;
    }
}