import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;

public class java_20220703_1_for {

    public static void main(String arge[])throws IOException{

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int Num;

        Num = sc.nextInt();

        for (int i =1; i<=Num ; i++){
            System.out.println(i);
        }

    }

}
