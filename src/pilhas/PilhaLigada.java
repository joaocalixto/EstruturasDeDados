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

    void pop(){
      topo = topo.next;
    }
    void imprimir(){
        Node atual = topo;
        while (atual != null){
            System.out.println(atual.data);
            atual = atual.next;
        }
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

        pilha.imprimir();
    }

}
