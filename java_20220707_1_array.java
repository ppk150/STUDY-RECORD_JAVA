import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class java_20220707_1_array {

    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int A,B, count ;

        count = 0;


        int[] Num = new int[42];


        for (int i = 0; i < 10; i++) {
            A = sc.nextInt();
            B = A % 42;
            Num[B]++;
        }

        for (int j = 0 ; j<42;j++){

            if ( Num[j] !=0){
                count++;

            }

        }

        System.out.println(count);

    }
}
