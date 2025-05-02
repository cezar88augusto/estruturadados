public class Main {
    public static void main(String[] args) {
        PilhaVetor pilhaVetor = new PilhaVetor(10);

        pilhaVetor.adicionarNumeroNaPilha(1);
        pilhaVetor.adicionarNumeroNaPilha(2);
        pilhaVetor.adicionarNumeroNaPilha(3);

        pilhaVetor.removerNumeroDaPilha();
        pilhaVetor.removerNumeroDaPilha();
    }
}