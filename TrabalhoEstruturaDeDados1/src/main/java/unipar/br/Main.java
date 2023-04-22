package unipar.br;

import MetodosOrd.OrdenacaoBolha;
import MetodosOrd.OrdenacaoInsercao;
import MetodosOrd.OrdenacaoSelecao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Por gentileza, digite os elementos do vetor separados por uma vírgula: ");

        String[] elementos = scanner.next().split(",");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementos[i]);
        }

        System.out.println("Escolha um método de ordenação:");
        System.out.println("1. Ordenação por inserção");
        System.out.println("2. Ordenação por seleção");
        System.out.println("3. Ordenação bolha");
        int escolha = scanner.nextInt();

        long inicio = System.currentTimeMillis();
        int[] vetorOrdenado;

        switch (escolha) {
            case 1:
                vetorOrdenado = OrdenacaoInsercao.ordenar(vetor);
                System.out.println("Método de ordenação: inserção");
                break;
            case 2:
                vetorOrdenado = OrdenacaoSelecao.ordenar(vetor);
                System.out.println("Método de ordenação: seleção");
                break;
            case 3:
                vetorOrdenado = OrdenacaoBolha.ordenar(vetor);
                System.out.println("Método de ordenação: bolha");
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        long fim = System.currentTimeMillis();

        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();


        long tempoExecucao = fim - inicio;
        System.out.println("Tempo de execução: " + tempoExecucao + "ms");

        scanner.close();
    }
}
