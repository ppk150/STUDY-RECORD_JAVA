import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java_20220717_1_math {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);;

        int T = sc.nextInt();

        for (int i = 0 ; i < T ; i++) {

            int H = sc.nextInt();

            int W = sc.nextInt();

            int N = sc.nextInt();

            int w = N / H;

            int h = N % H;

            if (h == 0 ){
                h = H;
                w = w -1;
            }

            System.out.println(h* 100 + w+1);
        }

    }
}
