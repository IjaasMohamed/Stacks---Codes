package Stack;

public class Main {
    public static void main(String[] args) {
        stack stackX = new stack(4);
        stackX.push('4');
        System.out.println(stackX.peek());
        stackX.push('c');
        stackX.push('1');
        System.out.println(stackX.pop());
        stackX.push('F');
        System.out.println(stackX.pop());
        System.out.println(stackX.pop());
        System.out.println(stackX.pop());
        System.out.println(stackX.pop());
    }
}