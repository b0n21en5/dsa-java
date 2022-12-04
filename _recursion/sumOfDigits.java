import java.util.Scanner;

public class sumOfDigits {
    
    public static int sumOfDigits(int num){

        int sum = 0;
        
        return sumOfDigits(num, sum);
    }


    public static int sumOfDigits(int num, int sum){

        if (num<10){
            sum += num;
            return sum;
        }
            
        
        sum += num%10;

        num /= 10;

        return sumOfDigits(num,sum);
        
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want sum: ");
        int num = sc.nextInt();
        System.out.println("Sum of Digits of number is: "+sumOfDigits(num));

        sc.close();
    }
}
