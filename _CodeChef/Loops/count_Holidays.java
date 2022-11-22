import java.util.Scanner;

class count_Holidays{

    static Scanner sc  = new Scanner(System.in);


    static void count_Holidays(){
        
        int t = sc.nextInt();

        while(t-->0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int e=0; e<arr.length;e++){
                arr[e] = sc.nextInt();
            }

            int[] arr2 = {6, 7, 13, 14, 20, 21, 27, 28};

            int holi = 8;

            for (int e:arr){

                boolean b =true;

                for (int i:arr2){

                    if (e==i){
                        b = false;
                        break;
                    }
                }

                if (b) holi++;
            }

            System.out.println("Number of holidays in this month is " + holi);
        }
    }

    public static void main(String[] args) {
        
        count_Holidays();
    }
}