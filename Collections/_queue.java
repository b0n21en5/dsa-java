import java.util.ArrayDeque;
import java.util.Queue;

public class _queue {
    
    public static void main(String[] args) {
        
        ArrayDeque<String> android = new ArrayDeque<>();

        android.add("samsung");
        System.out.println(android);

        android.addFirst("realme");
        System.out.println(android);
            
        android.addLast("redmi");
        System.out.println(android);

        System.out.println("contains: " + android.contains("nokia"));

        android.offerFirst("vivo");
        android.offerLast("poco");
        System.out.println(android);

        System.out.println("poll: "+ android.poll());

        System.out.println("peek: " + android.peek());

        // System.out.println(android.stream());

        System.out.println("length: " + android.size());
        android.pop();
        System.out.println("after pop: " + android);

       
        System.out.println( android.remove("apple"));


        System.out.println("get first: "  + android.getFirst());
        System.out.println("get last: " +  android.getLast());

        System.out.println("is empty: " + android.isEmpty());
    }
}
