public class Stack {

    int size;
    int top;
    int [] array;

    public Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return  (top == size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if(isFull()) {
            System.out.println("Stack overflow");
        }else {
            array[top + 1] = item;
            top++;
        }

    int pop(){
            int previousTop = top;
            if(isEmpty()) {
                System.out.println("Stack underflow");
            }else {
            int item = array[top];
            top--;
            return item;
            }
        }
    void resultStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }else {
                System.out.println("Stack items; ");
                for (int 1 = 0; 1 <= top; 1++){
                    System.out.println(array[1] + " ");
                }
                System.out.println();
                }
            }
        }
}
