import java.io.InputStream;
import java.util.Scanner;

public class java_20220725_4_reapeat {

    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(Math.round(repeat(N)));


    }

    public static int repeat(int num){

        if (num == 0 ){
            return 0;
        }
        if (num == 1||num==2){
            return 1;
        }else {

            return repeat(num - 1 ) + repeat(num-2);

        }


    }


}
