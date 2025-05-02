import java.util.ArrayList;

public class PilhaArrayList {

    private final ArrayList<Integer> elementos;

    public PilhaArrayList() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarNumeroNaPilha(int numero) {
        elementos.add(numero);
    }

    public void removerNumeroDaPilha() {
        if (isVazia()) {
            System.out.println("Não é possível remover elementos de uma pilha vazia!");
            return;
        }
        int desempilhado = elementos.removeLast();
        System.out.println("Valor desempilhado: " + desempilhado);
    }

    public boolean isVazia() {
        return elementos.isEmpty();
    }

    public void exibir() {
        System.out.println("Pilha: " + elementos);
    }
}