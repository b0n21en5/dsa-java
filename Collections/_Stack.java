import java.util.Scanner;
import java.util.Stack;

class _Stack{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        Stack<Integer> stack = new Stack<>();
        
        for (int i=0;i<5;i++){

            int n = sc.nextInt();
            stack.push(n);
        }

        System.out.println(stack);

        // stack.pop();

        // System.out.println(stack);

        
        System.out.println(stack.peek());

        System.out.println(stack.search(5));
    }
}