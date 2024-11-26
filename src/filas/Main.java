package filas;

public class Main {
    public static void main(String[] args) {
        // Testando a fila com array
        System.out.println("Fila com Array:");
        QueueArray queueArray = new QueueArray(5);
        queueArray.enqueue(10);
        queueArray.enqueue(20);
        queueArray.enqueue(30);
        System.out.println("Elemento no início: " + queueArray.peek());
        System.out.println("Removendo elemento: " + queueArray.dequeue());
        queueArray.enqueue(40);
        queueArray.enqueue(50);
        queueArray.enqueue(60);
        System.out.println("Fila cheia? " + queueArray.isFull());
        System.out.println("Removendo elemento: " + queueArray.dequeue());

        // Testando a fila com lista encadeada
        System.out.println("\nFila com Lista Encadeada:");
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(100);
        queueLinkedList.enqueue(200);
        queueLinkedList.enqueue(300);
        System.out.println("Elemento no início: " + queueLinkedList.peek());
        System.out.println("Removendo elemento: " + queueLinkedList.dequeue());
        queueLinkedList.enqueue(400);
        queueLinkedList.enqueue(500);
        System.out.println("Tamanho da fila: " + queueLinkedList.size());
    }
}