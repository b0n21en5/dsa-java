import java.util.HashMap;

public class hashMap {
    

    public static void main(String[] args) {
        
        // creating an empty hashmap object of
        // strings & integer type
        HashMap<String, Integer> map1 = new HashMap<>();

        //adding elements to the map 
        //using standard put method
        map1.put("Kayach", 455);
        map1.put("Dibakar", 566);
        map1.put("Souvik", 420);
        map1.put("Gourmani", 430);
        map1.put("Ratnadip", 484);

        int n = map1.size();
        System.out.println(n);

        // map1.

        //printing the map1 object elements
        System.out.println(map1);


        System.out.println("marks obtained by kayach is: "+ map1.get("Dibakar"));
        

        //checking if a key is present 
        // then print its value

        if (map1.containsKey("hemant")){


            // get method will return value 
            // of a key from map object

            System.out.println("student attended exam");
        }
        else{
            System.out.println("absent");
        }
        
    }
}


