import java.io.InputStream;
import java.util.Scanner;

public class java_20220713_3_math {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc =new Scanner(System.in);

        int T = sc.nextInt();

        int toggle = 0;

        int count = 1;
        int result = 1;

        while(toggle==0){

            count = count +6*(result-1);
            if (count>=T){
                break;
            }
            result++;


        }
        System.out.println(result);
    }
}
