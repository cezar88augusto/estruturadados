import java.util.ArrayList;

public class PilhaArrayList {

    private final ArrayList<Integer> elementos;
    private final ArrayList<Integer> menorElemento;

    public PilhaArrayList() {
        this.menorElemento = new ArrayList<>();
        this.elementos = new ArrayList<>();
    }

    public void adicionarNumeroNaPilha(int numero) {
        elementos.add(numero);
        if (menorElemento.isEmpty() || numero < menorElemento.getLast()) {
            menorElemento.add(numero);
        }
    }

    public void removerNumeroDaPilha() {
        if (isVazia()) {
            System.out.println("Não é possível remover elementos de uma pilha vazia!");
            return;
        }
        int desempilhado = elementos.removeLast();

        System.out.println("Valor desempilhado: " + desempilhado);
    }

    public void obterMenorElementoDaPilha() {
        System.out.println("Menor elemento da pilha: " + menorElemento.getFirst());
    }

    private boolean isVazia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        PilhaArrayList pilhaArrayList = new PilhaArrayList();

        pilhaArrayList.adicionarNumeroNaPilha(39); // 1ª Adicionado
        pilhaArrayList.adicionarNumeroNaPilha(40); // 2ª Adicionado
        pilhaArrayList.adicionarNumeroNaPilha(10); // 3ª Adicionado
        pilhaArrayList.adicionarNumeroNaPilha(30); // 4ª Adicionado

        pilhaArrayList.removerNumeroDaPilha();
        pilhaArrayList.removerNumeroDaPilha();

        pilhaArrayList.obterMenorElementoDaPilha();
    }
}