package q2;
import Stack.stack;
public class bracketTest {
    private String in;

    public bracketTest(String in){
        this.in = in;
    }
    public void brcketCheck(){
        int size = in.length();
        stack stacky = new stack(size);

        for (int i = 0 ; i < size ; i ++ ){
            if (in.charAt(i) == '('){
                stacky.push('(');
            }
            else if (in.charAt(i) == ')' ){
                stacky.pop();
            }
        }
            if(!stacky.isEmpty()){
                System.out.println("Invalid String");
            }
            else{
                System.out.println("Valid String");
            }
    }

}
