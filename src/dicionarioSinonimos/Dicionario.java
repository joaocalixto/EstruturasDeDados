package dicionarioSinonimos;

import listas.ligadas.ListaLigada;

import java.util.Arrays;

public class Dicionario {

    class Node{
        String palavra;
        String[] sinominos;
        Node next;

        public Node(String palavra, String[] sinonimos){
            this.palavra = palavra;
            this.sinominos = sinonimos;
        }
    }

    private Node cabeca;

    private Dicionario(){
        this.cabeca = null;
    }

    public void adicionar(String palavra, String[] sinonimos) {
        Dicionario.Node novoElemento = new Dicionario.Node(palavra, sinonimos);
        if (cabeca == null) {
            cabeca = novoElemento;
        } else {
            Dicionario.Node atual = cabeca;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoElemento;
        }
    }

    public String[] buscar(String palavra){
        Node atual = cabeca;

        while (atual != null){
            // equals
            if(atual.palavra.equals(palavra)){
                return atual.sinominos;
            }
            atual = atual.next;
        }

        return null;
    }

    public void imprimir() {
        // se o head for null a lista esta vazio

        Dicionario.Node atual = this.cabeca;

        while (atual != null) {
            System.out.println(atual.palavra + " "  + Arrays.toString(atual.sinominos));
            atual = atual.next;
        }

    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionar("bonito", new String[]{"belo", "lindo", "sublime"});
        dicionario.adicionar("estreito", new String[]{"apertado", "justo"});
        dicionario.adicionar("mau", new String[]{"ruim"});

        String[] estreitos = dicionario.buscar("estreito");

        System.out.println("Buscar encontrado = "+ Arrays.toString(estreitos));

        dicionario.imprimir();
    }
}
