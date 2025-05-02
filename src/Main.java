public class Main {
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