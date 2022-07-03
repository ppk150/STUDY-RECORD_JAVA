import java.io.IOException;
import java.io.InputStream;
import java.text.Format;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class java_20220703_2_for {

    public static void main(String arge[])throws IOException{
        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int Num;

        Num = sc.nextInt();

        IntStream.range(1, Num+1).forEach((int value) -> System.out.println(value));

    }

}