package pilhas;

public class PilhaLigada {

    private Node topo;

    void push(int data) {
        Node novoElemento = new Node(data);

        if (topo != null) {
            novoElemento.next = topo;
        }
        topo = novoElemento;

    }

    int pop(){
      int data = topo.data;
      topo = topo.next;
      return data;
    }
    void imprimir(){
        Node atual = topo;
        while (atual != null){
            System.out.println(atual.data);
            atual = atual.next;
        }
    }

    int peek(){
        return topo.data;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        PilhaLigada pilha = new PilhaLigada();
        pilha.push(10);
        pilha.push(5);
        pilha.push(15);

        pilha.pop();
        System.out.println("Peek = "+ pilha.peek());

        pilha.imprimir();
    }

}
