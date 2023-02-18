public class StackX {
    private int maxSize; //defines the maximum size of the array
    private double [] stackArray; //defines the element as an array
    private int top; //creates the top

    public StackX(int size){  //constructor
        this.maxSize = size; //assign to the max size
        stackArray = new double[maxSize]; //create a stack object
        top = -1;  //assign top
    }
    public void push(double j){
        if (top == maxSize-1){
            System.out.println("Stack Full");
        } else
        {
            stackArray[++top] = j; //increment and design
//            top++;
//            stackArray[top] =  j ;
        }
    }
    public double pop(){
        if (top == -1){
            System.out.println("Stack Empty");
            return -99;
        } else {
            return stackArray[top --];
        }
    }

    public double peek (){
        if (top == -1 ){
            System.out.println("Stack Empty");
            return -99;
        }
        else {
            return stackArray[top];
        }
    }
}
