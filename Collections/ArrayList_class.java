import java.util.ArrayList;



//the ArrayList class is a resizeable array,

//arraylist has a regular array inside it
//whenever array size is out of bound new array with
// bigger size of array replaced with old array
// implementation of new array: [currentSize + (currentSize/2)]


class ArrayList_class{
    
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");  //add item
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");
        cars.add("Suzuki");
        cars.add("Hyundai");
        System.out.println(cars);


        System.out.println(cars.get(4));  //access item

        cars.set(3, "Honda");  //change item


        cars.remove("Ford");  //remove item
        cars.remove(2); //
        System.out.println(cars);



        cars.clear();  //removes all items
        System.out.println(cars);


        System.out.println("Length of the ArrayList is " +cars.size());   //length of ArrayList
        
    }
}