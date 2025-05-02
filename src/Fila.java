import java.util.ArrayList;

public class Fila {

    private final ArrayList<Integer> fila;

    public Fila() {
        this.fila = new ArrayList<>();
    }

    public void adicionarNumeroFila(Integer numero) {
        fila.add(numero);
    }

    public void removerPrimeiroElementoDaFila() {
        if (isPilhaVazia()) {
            throw new IllegalStateException("Não é possível remover itens de uma fila vazia.");
        }
        var numeroRemovido = fila.removeFirst();
        System.out.println("Número removido: " + numeroRemovido);
    }

    public boolean isPilhaVazia() {
        return fila.isEmpty();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionarNumeroFila(5);
        fila.adicionarNumeroFila(3);
        fila.adicionarNumeroFila(7);

        fila.removerPrimeiroElementoDaFila();
        fila.removerPrimeiroElementoDaFila();
        fila.removerPrimeiroElementoDaFila();
    }
}