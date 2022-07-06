import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220706_1_array {

    public static void main(String[] args) {

        InputStream in = System.in ;
        Scanner sc = new Scanner(System.in);

        int T;


        T = sc.nextInt();

        int[] A =new int[T];

        for (int i = 0 ; i < T; i++ ) {
            A[i] = sc.nextInt();

        }
        Arrays.sort(A);
        System.out.println(A[0]+" "+A[T-1]);

    }
}
