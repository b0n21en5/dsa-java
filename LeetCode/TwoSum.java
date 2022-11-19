import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    // this program will show two indices from an array, 
    // sum of which is equals to target entered by the user


    public static int[] twoSum(int[] nums, int target) {

        //creating a hashmap
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            // if one int is already in map & sum of next one is 
            // equals to target then method will return from here

            if (map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};


            //when map did not contains any int value,
            // m.put adds value to map
            map.put(nums[i], i);

            
        }

        //if there's no such elements exists then it will return -1
        return new int[]{-1,-1};
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of test cases u want to run: ");
        int t = sc.nextInt();

        while(t>0){

            System.out.println("Enter size of the array ");
            int size = sc.nextInt();

            //initializing array with same size
            int[] nums = new int[size];

            System.out.println("Enter elements of the array");
            for (int i=0;i<size;i++){
                nums[i] = sc.nextInt();
            }

            //last input must be target 
            System.out.println("Enter your target ");
            int target = sc.nextInt();

            nums = twoSum(nums, target);

            System.out.print("\nRequired indices are: ");

            for (int e : nums){
                System.out.print(e);

                if (e==nums[nums.length-1])
                    break;
                System.out.print(",");
                
            }
            t--;
        }


        sc.close();
    }
}
