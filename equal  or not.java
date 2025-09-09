import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        sc.close();
    }
}
