import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220811_4_Geo {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);
        int end = 0 ;


        while (end == 0){
            int[] A = new int[3];
             A[0] = sc.nextInt();
             A[1] = sc.nextInt();
             A[2] = sc.nextInt();

             if(A[0]==0&& A[1]==0&&A[2]==0){
                 end = 1;
                 break;
             }

            Arrays.sort(A);
            if(A[0]*A[0]+A[1]*A[1]==A[2]*A[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }
    }
}
