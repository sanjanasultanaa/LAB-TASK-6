import java.util.*;

public class Solve5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");

        while (scan.hasNext()) {
            String s = scan.next();
            int x = scan.nextInt();

             
            System.out.printf("%-15s%03d%n", s, x);
        }

        System.out.println("================================");

        scan.close();
    }
}