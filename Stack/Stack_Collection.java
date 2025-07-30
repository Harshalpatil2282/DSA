import java.util.*;
public class Stack_Collection {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Stack :"+stack);
    }
}
