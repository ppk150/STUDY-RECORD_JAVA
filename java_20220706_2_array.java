import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220706_2_array {

    public static void main(String[] args) {

        InputStream in = System.in ;
        Scanner sc = new Scanner(System.in);

        int[] A =new int[9];
        int[] B =new int[9];
        int count = 1;


        for (int i = 0 ; i < 9; i++ ) {
            A[i] = sc.nextInt();
            //B[i] = A[i];

        }
        B=A;

        Arrays.sort(A);

        for (int k =0 ; k < 9 ; k++){
            if (A[8]==B[k]){
                break;
            }

            count++;
        }
        System.out.println(A[8]);
        System.out.println(count);

    }
}
