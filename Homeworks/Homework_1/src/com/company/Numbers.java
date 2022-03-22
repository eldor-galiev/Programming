import java.util.Scanner;
public class homework_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int finish = 2_147_483_647;
        int mid = (start + finish) / 2;
        boolean isFound = false;
        int sign;
        int count = 1;
        
        while (!isFound) {
            System.out.println(count + ")" + "Your number is "+ mid + "?");
            System.out.println("1 - less; 2 - more; 0 - equal");
            sign = in.nextInt();
            if (sign == 1) {
                finish = mid;
                mid = (start + finish) / 2;
            }
            if (sign == 2) {
                start = mid;
                mid = (start + finish) / 2;
            }
            if (sign == 0) {
                isFound = true;
                System.out.println("Your number is "+ mid + "!");
            }
            count++;
        }
    }
}