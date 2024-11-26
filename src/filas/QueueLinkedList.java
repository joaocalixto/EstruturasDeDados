package filas;

class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Início da fila
    private Node rear;  // Final da fila
    private int size;   // Tamanho da fila

    // Construtor para inicializar a fila
    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Insere um elemento no final da fila
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;

        if (front == null) {
            front = rear;
        }
        size++;
    }

    // Remove um elemento do início da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia. Não é possível remover elementos.");
        }
        int data = front.data;
        front = front.next;

        if (front == null) { // Caso a fila fique vazia
            rear = null;
        }
        size--;
        return data;
    }

    // Inspeciona o início da fila
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        return front.data;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return front == null;
    }

    // Retorna o tamanho atual da fila
    public int size() {
        return size;
    }
}