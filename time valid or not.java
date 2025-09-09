import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] parts = input.split(":");

        if (parts.length == 3) {
            int hh = Integer.parseInt(parts[0]);
            int mm = Integer.parseInt(parts[1]);
            int ss = Integer.parseInt(parts[2]);

            if (hh >= 0 && hh < 24 && mm >= 0 && mm < 60 && ss >= 0 && ss < 60) {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
        } else {
            System.out.println("Not Valid");
        }

        sc.close();
    }
}
