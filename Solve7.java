import java.util.*;

public class Solve7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();  

        for (int j = 0; j < q; j++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();  
        }

        in.close();
    }
}
