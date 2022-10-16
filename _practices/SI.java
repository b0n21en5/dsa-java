import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SI
{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double p,r,t;
        p = scn.nextDouble();
        r = scn.nextDouble();
        t = scn.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest is"+" "+si);

    }
}