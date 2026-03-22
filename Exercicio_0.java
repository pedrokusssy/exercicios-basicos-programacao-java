import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Exercicio_0 {

    public static void main(String[] args) {

        /**
         * 1.
         * Faça um algoritmo que leia um vetor A de tamanho N de inteiros
         * e crie um vetor B contendo apenas valores não repetidos.
         * Mostre o vetor B e o total de elementos únicos.
         */
        System.out.println("***** EXERCÍCIO 1 *****");

        Integer[] vetorA1 = { 678, 123, 345, 768, 678, 345, 578, 98, 123, 2345, 100, 8, 678, 345, 768, 12 };

        List<Integer> vetorB1 = new ArrayList<>(listaSemElemRepetidos(vetorA1));

        System.out.println("\nLista com elementos repetidos\nTamanho da Lista: " + vetorA1.length);
        System.out.println(Arrays.asList(vetorA1));

        System.out.println("\n\nLista sem elementos repetidos\nTamanho da Lista: " + vetorB1.size());
        System.out.println(vetorB1);

        /**
         * 5.
         * Faça um algoritmo que que dois Vetores A e B de tamanho N de inteiros
         * e crie um vetor C contendo apenas os numeros que existem nos dois vetores,
         * mas não pode repetir valores no vetor C.
         * Mostre o Vetor C.
         */
        System.out.println("\n-----------------------------\n\n***** EXERCÍCIO 5 *****\n");
        Integer[] vetorA5 = { 1, 2, 3, 3, 3, 4, 5, 6, 2, 3, 7, 8, 2, 1 };
        Integer[] vetorB5 = { 5, 6, 2, 3, 7, 1, 2, 3, 3, 3, 4, 5, 6, 2, 3, 7, 8, 2 };
        System.out.println("Vetor A: " + Arrays.asList(vetorA5) + "\nVetor B: " + Arrays.asList(vetorB5) + "\nVetor C: "
                + juntaVetorERetornaSemElementosRepetidos(vetorA5, vetorB5));
    }

    private static Set<Integer> listaSemElemRepetidos(Integer[] elementos) {
        // Recebe um Array de Inteiros
        // Converte o Array Elementos em Lista Para o HashSet receber no seu construtor
        Set<Integer> elementosNaoRepetidos = new HashSet<>(Arrays.asList(elementos));
        return elementosNaoRepetidos;
    }

    private static Set<Integer> juntaVetorERetornaSemElementosRepetidos(Integer[] vetorA, Integer[] vetorB) {
        List<Integer> lista_C = new ArrayList<>();
        // Junta os dois vetor recebidos : Vetor A e B
        lista_C.addAll(Arrays.asList(vetorA));
        lista_C.addAll(Arrays.asList(vetorB));
        // Converte a ListaC em Array
        // Passa o Arrya para o metodo : listaSemElemRepetidos e retorna uma lista sem
        // nenhum elemento repetido
        return listaSemElemRepetidos(lista_C.toArray(new Integer[lista_C.size()]));
    }
}
