import java.io.IOException;
import java.io.InputStream;
import java.text.Format;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;


public class java_20220704_1while {
    public static void main(String[] args) {

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int N, Num, count , total, one;

        count = 0;

        N = sc.nextInt();

        Num = N;

        while(true){

            one = (Num/10) + (Num%10);

            total = (Num%10)*10 + one%10;

            count++;

            Num = total;

            if (N == total){
                System.out.println(count);
                break;
            }

        }


    }
}
