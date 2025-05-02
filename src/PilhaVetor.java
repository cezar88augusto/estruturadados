public class PilhaVetor {

    private final int[] vetor;
    private int topo;
    private final int capacidade;

    public PilhaVetor(int capacidade) {
        this.vetor = new int[capacidade];
        this.capacidade = capacidade;
        this.topo = -1;
    }

    public void adicionarNumeroNaPilha(int numero) {
        if (isPilhaCheia()) {
            System.out.println("Pilha cheia. Não é possível adicionar " + numero);
            return;
        }
        vetor[++topo] = numero;
    }

    public void removerNumeroDaPilha() {
        if (isVazia()) {
            System.out.println("Não é possível remover elementos de uma pilha vazia!");
            return;
        }
        int desempilhado = vetor[topo--];
        System.out.println("Valor desempilhado: " + desempilhado);
    }

    private boolean isPilhaCheia() {
        return topo == capacidade - 1;
    }

    private boolean isVazia() {
        return topo == -1;
    }
}
