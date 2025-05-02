import java.util.ArrayList;

public class SuperStack {
    private ArrayList<Integer> stack; // Lista para armazenar os elementos
    private ArrayList<Integer> minStack; // Lista para armazenar os mínimos

    public SuperStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    // Adiciona um elemento à pilha
    public void add(int value) {
        stack.add(value);
        // Adiciona à minStack o novo mínimo
        if (minStack.isEmpty() || value <= minStack.get(minStack.size() - 1)) {
            minStack.add(value);
        }
    }

    // Remove o elemento no topo da pilha
    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.remove(stack.size() - 1);
            // Remove da minStack se o elemento for igual ao mínimo atual
            if (!minStack.isEmpty() && removed == minStack.get(minStack.size() - 1)) {
                minStack.remove(minStack.size() - 1);
            }
        } else {
            throw new IllegalStateException("A pilha está vazia.");
        }
    }

    // Retorna o elemento no topo da pilha
    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        throw new IllegalStateException("A pilha está vazia.");
    }

    // Retorna o menor elemento da pilha
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.get(minStack.size() - 1);
        }
        throw new IllegalStateException("A pilha está vazia.");
    }

    public static void main(String[] args) {
        SuperStack superStack = new SuperStack();

        superStack.add(5);
        superStack.add(3);
        superStack.add(7);
        System.out.println("Topo: " + superStack.top()); // Saída: 7
        System.out.println("Mínimo: " + superStack.getMin()); // Saída: 3

        superStack.pop();
        System.out.println("Topo: " + superStack.top()); // Saída: 3
        System.out.println("Mínimo: " + superStack.getMin()); // Saída: 3

        superStack.pop();
        System.out.println("Topo: " + superStack.top()); // Saída: 5
        System.out.println("Mínimo: " + superStack.getMin()); // Saída: 5
    }
}
