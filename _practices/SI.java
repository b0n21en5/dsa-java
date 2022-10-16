import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SI
{
    public static double SimpleInterest(double p, double r, double t){
        double si = (p*r*t)/100;
        return si;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double p,r,t;
        p = scn.nextDouble();
        r = scn.nextDouble();
        t = scn.nextDouble();
        System.out.println(SimpleInterest(p,r,t));

    }
}