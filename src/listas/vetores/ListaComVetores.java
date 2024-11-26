package listas.vetores;

public class ListaComVetores {

    private int[] elementos;
    private int contador;

    public ListaComVetores(int capacidade) {
        this.elementos = new int[capacidade];
        this.contador = 0;
    }

    public void adicionar(int novoElemento){

        // se o estiver cheio, aumentar o tamanho do vetor
        if(contador == elementos.length){
            redimencionar();
        }
        elementos[contador] = novoElemento;
        contador++;
    }
    public void remover(int posicao){
        //
    }

    private void adicionar(int novoElemento, int posicao) {
        // verifar se a posicao é válida
        // se posicao é maior que zero e menor que o lenght do array

        // redimencionar

        // Descolar os elementos para direita
        // começa com o ultimo elemento
        // percorre até a posicao desejada ao contrado i--
        for(int i = contador; i > posicao ; i--){
            elementos[i] = elementos[i-1];
        }
        elementos[posicao] = novoElemento;
        contador++;
    }

    private void redimencionar() {
        // Com ArrayList do Java, isso é feito aumotaticamento
        int novaCapacidade = elementos.length * 2;

        int[] novoArray = new int[novaCapacidade];
        for (int i=0; i< elementos.length; i++){
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }

    public void imprimir() {
       for (int i=0; i< elementos.length; i++){
           System.out.println(elementos[i]);
       }
    }

    public static void main(String[] args) {
        ListaComVetores lista = new ListaComVetores(5);
        lista.adicionar(2);
        lista.adicionar(5);
        lista.adicionar(5);
        lista.adicionar(5);
        lista.adicionar(5);
        lista.adicionar(6);

        lista.adicionar(70, 3);
        lista.imprimir();
    }


}
