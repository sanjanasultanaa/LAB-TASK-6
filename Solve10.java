import java.util.Scanner;

public class Solve10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 

        
        String s = String.valueOf(n);

        
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        scanner.close();
    }
}
