public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        pilha.adicionarNumeroNaPilha(1);
        pilha.adicionarNumeroNaPilha(2);

        pilha.removerNumeroDaPilha();
        pilha.removerNumeroDaPilha();
    }
}