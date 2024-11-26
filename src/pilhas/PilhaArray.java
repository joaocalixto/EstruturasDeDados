package pilhas;

public class PilhaArray {

    private int capacidade;
    private int topo;
    private int[] pilha;

    public PilhaArray(int capacidade){
        this.capacidade = capacidade;
        pilha = new int[capacidade];
        topo = -1;
    }

    void push(int data){
        // verificar se a lista esta cheia
        if(isFull()){
            throw new RuntimeException("A lista esta cheia");
        }
        pilha[++topo] = data;
    }

    int pop(){
        // verificar se a lista esta cheia
        if(isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }
        return pilha[topo--];
    }

    int peek(){
        return pilha[topo];
    }

    void imprimir(){
        for (int i =topo ; i>= 0; i--){
            System.out.println(pilha[i]);
        }
    }

    private boolean isEmpty() {
        return topo == -1;
    }

    private boolean isFull() {
        return topo == capacidade -1;
    }

    public static void main(String[] args) {
        PilhaArray pilhaArray = new PilhaArray(5);
        pilhaArray.push(10);
        pilhaArray.push(5);
        pilhaArray.push(15);

        System.out.println("Peek = "+ pilhaArray.peek());

        pilhaArray.imprimir();
    }
}
