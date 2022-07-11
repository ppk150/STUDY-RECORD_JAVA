import java.io.InputStream;
import java.util.Scanner;

public class java_20220708_2_string {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T, sum,  num;

        T = Integer.parseInt(sc.nextLine());

        String[] B = new String[T];

        num =0;

        sum = 0;
        String A = sc.nextLine();

        for (int i =0; i < T ; i ++){

            String[] C = A.split("");


            sum = sum + Integer.parseInt(C[i]);

        }

        System.out.println(sum);

    }
}
