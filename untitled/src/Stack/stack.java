package Stack;

public class stack {
    private int maxSize;
    private char[] stackArray ;
    private int top;

    public stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    public void push( char val){
        if (!isFull()){
            stackArray[++top] = val;
        } else {
            System.out.println("Stack is full");
        }
    }
    public double pop(){
        if(!isEmpty()){
            return stackArray[top--];
        } else {
            System.out.println("Stack array is empty");
            return -99;
        }
    }

    public double peek(){
        if (!isEmpty()){
            return stackArray[top];
        }
        else {
            return -99;
        }
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == (maxSize - 1) );
    }

}
