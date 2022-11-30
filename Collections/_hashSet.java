// HashSet is class which does not contain 
// duplicate values like array, linkedlist


import java.util.HashSet;
import java.util.Iterator;




public class _hashSet {
    
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<String>();

        set.add("Volvo");
        set.add("volvo");  // HashSet is case sensitive means 'Volvo' & 'volvo' treated as two value

        set.add("honda");
        set.add("honda");

        set.add("Lamborghini");
        set.add("vaspa");
        set.add("null");

        
        set.add("bmw");
        set.add("bmw");
        
        System.out.println(set);

        set.remove("vaspa");  //element can be removed by name
        System.out.println(set);


        // set.remove(2);     //element can't be removed with index
        // System.out.println(set);   


        // set.clear();         //clears out all elements
        // System.out.println(set);


        Iterator<String> itr = set.iterator();   //iterator carries the reference

        while(itr.hasNext())
        System.out.println(itr.next());   //itr.next()  is used to call next element from HashSet


    }
}




// there's so many cool functions in HashSet, one must explore
// thanks
