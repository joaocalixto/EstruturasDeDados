package filas;

class QueueArray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Construtor para inicializar a fila
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Insere um elemento no final da fila
    public void enqueue(int data) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia. Não é possível adicionar mais elementos.");
        }
        rear = (rear + 1) % capacity; // Movimento circular
        queueArray[rear] = data;
        size++;
    }

    // Remove um elemento do início da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia. Não é possível remover elementos.");
        }
        int data = queueArray[front];
        front = (front + 1) % capacity; // Movimento circular
        size--;
        return data;
    }

    // Inspeciona o início da fila
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        return queueArray[front];
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return size == 0;
    }

    // Verifica se a fila está cheia
    public boolean isFull() {
        return size == capacity;
    }

    // Retorna o tamanho atual da fila
    public int size() {
        return size;
    }
}