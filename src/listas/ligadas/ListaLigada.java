package listas.ligadas;

public class ListaLigada {

    private Node cabeca;

    public ListaLigada() {
        this.cabeca = null;
    }

    public void adicionar(String data) {
        Node novoElemento = new Node(data);
        if (cabeca == null) {
            cabeca = novoElemento;
        } else {
            Node atual = cabeca;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoElemento;
        }
    }

    public void adicionar(String data, int posicao) {
        Node novoElemento = new Node(data);

        // Caso o adicionar for na cabeça
        if (posicao == 0) {
            novoElemento.next = cabeca;
            cabeca = novoElemento;
            return;
        }

        // Se a posição for no meio ou no fim
        Node atual = cabeca;
        int contador = 0;

        while (contador < posicao - 1 && atual != null) {
            atual = atual.next;
            contador++;
        }

        novoElemento.next = atual.next;
        atual.next = novoElemento;
    }

    public void imprimir() {
        // se a cabeça for null, a lista está vazia
        Node atual = this.cabeca;

        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }

    public void sort() {
        if (cabeca == null) return; // Lista vazia, nada a ordenar

        boolean trocado;
        do {
            Node atual = cabeca;
            Node proximo = cabeca.next;
            trocado = false;

            while (proximo != null) {
                // Comparar valores
                if (atual.data.compareTo(proximo.data) > 0) {
                    // Trocar os valores dos nós
                    String temp = atual.data;
                    atual.data = proximo.data;
                    proximo.data = temp;
                    trocado = true;
                }
                atual = proximo;
                proximo = proximo.next;
            }
        } while (trocado); // Repetir até não haver trocas
    }

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adicionar("joao");
        listaLigada.adicionar("matheus");
        listaLigada.adicionar("jose", 1);

        System.out.println("Lista antes da ordenação:");
        listaLigada.imprimir();

        listaLigada.sort();

        System.out.println("\nLista após a ordenação:");
        listaLigada.imprimir();
    }
}