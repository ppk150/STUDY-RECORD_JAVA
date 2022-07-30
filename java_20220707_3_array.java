import java.io.InputStream;
import java.util.Scanner;

public class java_20220707_3_array {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);


        int T, count , sum;

        count =0;

        sum = 0;

        T = Integer.parseInt(sc.nextLine());



            for (int i = 0; i < T; i++) {

                String A = sc.nextLine();
                String[] B = A.split("");

                int length = B.length;

                for (int k = 0; k < length; k++) {
                    if (B[k].equals("O")) {

                        count = count + 1;
                        sum = sum + count;

                    } else {
                        count = 0;
                    }

                }

                System.out.println(sum);
                sum = 0;
                count = 0;

            }
        }


}
