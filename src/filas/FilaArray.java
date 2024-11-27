package filas;

public class FilaArray {

    private int[] fila;
    private int front;
    private int rear;
    private int tamnhoAtual;
    private int tamanhoTotal;

    FilaArray(int tamanhoTotal){
        this.tamanhoTotal = tamanhoTotal;
        this.fila = new int[tamanhoTotal];
        this.front = 0;
        this.rear = -1;
        this.tamanhoTotal = 0;
    }

    void insert(int data){

        rear++;
        fila[rear] = data;
        tamanhoTotal++;
    }

    void remove(){

        front++;
        tamanhoTotal--;
    }

    void imprimir(){
        for (int i = front; i<= rear; i++){
            System.out.print(fila[i] + " ");
        }
    }


    public static void main(String[] args) {
        FilaArray filaArray = new FilaArray(5);
        filaArray.insert(6);
        filaArray.insert(4);
        filaArray.insert(-2);

        filaArray.remove();

        filaArray.imprimir();
    }

}
