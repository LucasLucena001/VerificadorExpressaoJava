public class Pilha {
    private char[] pilhaArray;
    private int topo;

    public Pilha(int capacidade) {
        pilhaArray = new char[capacidade];
        topo = -1;
    }

    public void push(char caractere) {
        if (topo == pilhaArray.length - 1) {
            throw new StackOverflowError("A pilha está cheia");
        }
        pilhaArray[++topo] = caractere;
    }

    public char pop() {
        if (topo == -1) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return pilhaArray[topo--];
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
