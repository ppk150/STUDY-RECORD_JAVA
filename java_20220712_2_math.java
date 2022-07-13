import java.io.InputStream;
import java.util.Scanner;

public class java_20220712_2_math {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int A, B, C, result;

        A = sc.nextInt();

        B = sc.nextInt();

        C = sc.nextInt();

        if (C < B || C == B){
            System.out.println("-1");
        }else{
            System.out.println(A/(C-B)+1);
        }



    }
}
