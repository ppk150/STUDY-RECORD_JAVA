import java.io.InputStream;
import java.util.Scanner;

public class java_20220812_2_Geo {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();


        System.out.println(String.format("%.6f", (r*r*Math.PI)));
        System.out.println(String.format("%.6f", (r*r*2)));
    }
}
