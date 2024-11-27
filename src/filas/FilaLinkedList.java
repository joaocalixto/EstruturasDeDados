package filas;

public class FilaLinkedList {

    class Node{
       int data;
       Node next;

       Node(int data){
           this.data = data;
           this.next = null;
       }
    }

    private  Node front;
    private Node rear;
    private int tamanhoAtual;

    FilaLinkedList(){
        this.front = null;
        this.rear = null;
        this.tamanhoAtual = 0;
    }

    void inserir(int data){
        Node novoElemento = new Node(data);

        if(rear == null){
            rear = novoElemento;
            front = novoElemento;
        }else{
            rear.next = novoElemento;
            rear = novoElemento;
        }
        tamanhoAtual++;
    }

    void remover(){
        front = front.next;
    }

    void imprimir(){
        Node atual = front;
        while (atual != null){
            System.out.print(atual.data+ " ");
            atual = atual.next;
        }
    }

    public static void main(String[] args) {
        FilaLinkedList filaLinkedList = new FilaLinkedList();
        filaLinkedList.inserir(2);
        filaLinkedList.inserir(3);
        filaLinkedList.inserir(4);

        filaLinkedList.remover();

        filaLinkedList.imprimir();
    }

}
