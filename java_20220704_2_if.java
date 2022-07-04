import java.io.InputStream;
import java.util.Scanner;

public class java_20220704_2_if {

    public static  void main(String args[]){
        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();

        B = sc.nextInt();


        if (A>0 && B>0){
            System.out.println("1");
        } else if(A>0 && B<0) {
            System.out.println("4");
        } else if(A<0 && B>0) {
            System.out.println("2");
        } else if(A<0 && B<0) {
            System.out.println("3");
        }


    }
}
