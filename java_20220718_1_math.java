import java.io.InputStream;
import java.util.Scanner;

public class java_20220718_1_math {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int end = 0;
        int count = 0;
        int C = 0;


        while(end == 0){

            if(N%5 ==0){
                C = N/5;
                count += C;
                break;
            }

            if (N%5 != 0 ){
                N = N - 3;
                count++;
            }

            if(N < 0 ){
                count = -1;
                break;
            }

        }
        System.out.println(count);

    }
}
