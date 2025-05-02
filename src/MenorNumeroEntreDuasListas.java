import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MenorNumeroEntreDuasListas {

    public static Set<Integer> intersecaoConjunto(List<Integer> listaUm, List<Integer> lisaDois) {
        Set<Integer> listaUmSet = new HashSet<>();

        listaUmSet.addAll(listaUm);

        listaUmSet.retainAll(lisaDois); // interseção

        return listaUmSet;
    }

    public static int obterMenorValor(Set<Integer> numeros) {
        int menor = numeros.stream().findFirst().orElse(0);
        for (int num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        var intersecaoConjunto = intersecaoConjunto(List.of(1, 2, 1, 3, 4, -5), List.of(10, 3, -9, 5, 3, -5, 4, 1, 50, 90));

        System.out.print("Interseção entre as listas: " + intersecaoConjunto);

        var menorValor = Collections.min(intersecaoConjunto);

        // OU

        var menorValorComFor = obterMenorValor(intersecaoConjunto);

        System.out.println();
        System.out.println("Menor valor com SET: " + menorValor);
        System.out.println("Menor valor com FOR: " + menorValorComFor);
    }
}
