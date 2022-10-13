

import java.util.Scanner;

import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

class Buff_read{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        int n, a, b;
        input = in.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        a = Integer.parseInt(input[1]);
        b = Integer.parseInt(input[2]);
        System.out.println((n-a)+" "+(n-a-b));
    }
}