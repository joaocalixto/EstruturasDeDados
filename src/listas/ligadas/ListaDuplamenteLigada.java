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

    public void inserirInicio(int data) {
        Node novoElemento = new Node(data);

        // Se a lista for vazia
        if (head == null) {
            head = novoElemento;
            return;
        } else {
            head.prev = novoElemento;
            novoElemento.next = head;
        }

        head = novoElemento;
    }

    public Node buscar(int data) {
        Node atual = head;
        Node encontrado = null;
        while (atual != null) {
            if (atual.data == data) {
                encontrado = atual;
                return encontrado;
            }
            atual = atual.next;
        }
        return encontrado;
    }

    public void inserirFim(int data) {
        Node novoElemento = new Node(data);

        // Se a lista estiver vazia
        if (head == null) {
            head = novoElemento;
            return;
        }
        Node atual = head;
        while (atual.next != null) {
            atual = atual.next;
        }
        atual.next = novoElemento;
        novoElemento.prev = atual;
    }

    public void imprimir() {
        Node atual = head;

        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }

    public void remover(int data) {
        Node atual = head;

        while (atual != null) {
            if (atual.data == data) {
                if (atual.next != null) {
                    atual.next.prev = atual.prev;
                }
                if (atual.prev != null) {
                    atual.prev.next = atual.next;
                } else {
                    head = atual.next; // Atualiza a cabeça se for o primeiro nó
                }
                return; // Elemento encontrado e removido, sair do método
            }
            atual = atual.next;
        }
    }

    public void sort() {
        if (head == null) return; // Lista vazia, nada para ordenar

        boolean trocado;
        Node atual;

        do {
            trocado = false;
            atual = head;

            while (atual.next != null) {
                if (atual.data > atual.next.data) {
                    // Trocar os valores
                    int temp = atual.data;
                    atual.data = atual.next.data;
                    atual.next.data = temp;
                    trocado = true;
                }
                atual = atual.next;
            }
        } while (trocado); // Repete até não haver trocas
    }

    public static void main(String[] args) {
        ListaDuplamenteLigada listaDuplamenteLigada = new ListaDuplamenteLigada();

        listaDuplamenteLigada.inserirFim(10);
        listaDuplamenteLigada.inserirFim(20);
        listaDuplamenteLigada.inserirInicio(2);
        listaDuplamenteLigada.inserirFim(5);

        System.out.println("Lista antes da ordenação:");
        listaDuplamenteLigada.imprimir();

        listaDuplamenteLigada.sort();

        System.out.println("\nLista após a ordenação:");
        listaDuplamenteLigada.imprimir();
    }
}