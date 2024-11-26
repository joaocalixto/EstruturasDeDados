package listas.ligadas;

public class ListaDuplamenteLigada {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    private Node head;

    public void inserirInicio(int data){

        Node novoElemento = new Node(data);

        // Se a lista for vazia
        if(head == null){
            head = novoElemento;
            return;
        }else{
            head.prev = novoElemento;
            novoElemento.next = head;
        }

        head = novoElemento;

    }

    public Node buscar(int data){
        Node atual = head;
        Node encontrado = null;
        while (atual != null){
            if(atual.data == data){
                encontrado = atual;
                return encontrado;
            }
            atual = atual.next;
        }
        return encontrado;
    }

    public void inserirFim(int data){

        // a lista estiver vazia
        Node novoElemento = new Node(data);
        if(head == null){
            head = novoElemento;
            return;
        }
        Node atual = head;
        while (atual.next != null){
            atual = atual.next;
        }
        atual.next = novoElemento;
        novoElemento.prev = atual;

    }

    public void imprimir(){
        Node atual = head;

        while (atual != null){
            System.out.println(atual.data + "->" + atual.next);
            atual = atual.next;
        }
    }
    public void remover(int data){
        Node atual = head;

        while (atual != null){
            if(atual.data == data){
                if(atual.next != null){
                    atual.next.prev = atual.prev;
                }
                if(atual.prev != null){
                    atual.prev.next = atual.next;
                }
            }

            atual = atual.next;
        }

    }


    public static void main(String[] args) {

        ListaDuplamenteLigada listaDuplamenteLigada = new ListaDuplamenteLigada();
        listaDuplamenteLigada.inserirFim(10);
        listaDuplamenteLigada.inserirFim(20);

        listaDuplamenteLigada.inserirInicio(2);

        listaDuplamenteLigada.remover(10);

        Node buscar = listaDuplamenteLigada.buscar(20);

        System.out.println("No encontrado "+ buscar.data);

        listaDuplamenteLigada.imprimir();
    }


}
