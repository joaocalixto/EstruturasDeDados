package listas;

public interface Lista {

    void adicionar(int novoElemento);
    void adicionar(int novoElemento, int posicao);
    void remover(int posicao);
    void buscar(int elemento);
    void imprimir();
}
