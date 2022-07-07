import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220707_2_array {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T;
        float sum;

        sum = 0;

        T = sc.nextInt();

        float[] A = new float[T];

        float[] B = new float[T];

        for (int i =0; i < T ; i++){

            A[i] = sc.nextInt();

        }

        Arrays.sort(A);

        for (int k =0; k < T ; k++){

            B[k] = (A[k]/A[T-1])*100;
        }

        for (int j = 0; j < T; j++ ) {

            sum = sum + B[j];

        }
        System.out.println(sum/T);
    }
}
