package MetodosOrd;

public class OrdenacaoSelecao {
    public static int[] ordenar(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }

        return vetor;
    }
}
