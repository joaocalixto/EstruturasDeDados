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

    public void adicionar(String data, int posicao){
        Node novoElemento = new Node(data);

        // Cado o adicionar for na cabeca
        if(posicao == 0){
            novoElemento.next = cabeca;
            cabeca = novoElemento;
            return;
        }

        // Se a posicao for no meio ou no fim
        Node atual = cabeca;
        int contador = 0;

        while (contador< posicao -1 && atual != null){
            atual = atual.next;
            contador++;
        }

        novoElemento.next = atual.next;
        atual.next = novoElemento;
    }


    public void imprimir() {
        // se o head for null a lista esta vazio

        Node atual = this.cabeca;

        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }

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
        listaLigada.imprimir();

    }



}
