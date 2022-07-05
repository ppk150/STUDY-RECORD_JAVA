import java.io.InputStream;
import java.util.Scanner;

public class java_20220705_1_for {
    public static void main(String[] args) {

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int T, A, B;

        T = sc.nextInt();

        int[] All = new int[T];

        for (int i = 0 ; i < T; i ++  ){

            A = sc.nextInt();

            B = sc.nextInt();

            All[i]= A+B;

        }
        for (int i = 0 ; i < T; i ++  ){
            System.out.println(All[i]);
        }

    }
}
