import java.util.LinkedList;


//LinkedList stores its items in containers, the list has link
// to the first container & each containers has link to the next 



public class LinkedList_class {
    

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>(); 



        cars.add("Volvo");  //add item
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");
        cars.add("Suzuki");
        cars.add("Hyundai");
        cars.add("Honda");
        cars.add("Lamborghini");

        

        

    // linkedlist has same fatures like 
    // arraylist some extra features are

        cars.addFirst("Ferrari");  //adds item to first
        cars.addLast("Tesla");  //adds items to last


        System.out.println(cars.getFirst());  //gets first item
        System.out.println(cars.getLast());     //gets last item



        System.out.println(cars);

        cars.removeFirst();   //removes first item
        cars.removeLast();    //removes last item


        System.out.println(cars);
        

    }
}
