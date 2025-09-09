import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] parts = input.split("/");

        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 9999) {
            System.out.println("Invalid");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    daysInMonth = 29; // Leap year
                else
                    daysInMonth = 28;
                break;
            default:
                daysInMonth = 0;
        }

        if (day >= 1 && day <= daysInMonth) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
