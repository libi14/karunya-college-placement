import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0 && n%3==0)
            System.out.print("HiHello");
        else if(n%3==0)
            System.out.print("Hi");
        else
            System.out.print("Hello");
            sc.close();
    }
}
