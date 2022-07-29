import java.io.InputStream;
import java.util.Scanner;

public class java_20220725_3_repeat {

    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        double N = sc.nextInt();

        System.out.println(Math.round(repeat(N)));


    }

    public static double repeat(double num){
        if (num == 1|| num == 0){
            return 1;
        }else{
            return num * repeat(num-1);
        }

    }


}
