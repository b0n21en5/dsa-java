import java.util.Scanner;
import java.util.Stack;

class _Stack{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        Stack<Integer> stack = new Stack<>();
        
        for (int i=0;i<15;i++){

            int n = sc.nextInt();
            stack.push(n);
        }

        System.out.println(stack);

        // stack.pop();

        // System.out.println(stack);

        System.out.println("size of the stack " + stack.capacity());

        System.out.println("is empty: "+ stack.empty());

        System.out.println("contains: "+stack.contains(8));
        
        System.out.println("peek of the stack: " + stack.peek());
        System.out.println("index of: "  + stack.indexOf(9));
        System.out.println("search: "+ stack.search(5));

        System.out.println("first element: "+stack.firstElement());
        System.out.println("last element: " + stack.lastElement());

        System.out.println("equals: "  + stack.equals(15));

        System.out.println("element at: " + stack.elementAt(5));
        System.out.println("get: " + stack.get(5));

        stack.clear();
        System.out.println(stack);
    }
}