import java.io.InputStream;
import java.util.Scanner;

public class java_20220720_1_math {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int count = 0;
        int toggle = 0;
        int JD = 0;

        for (int i =0 ; i < T ; i++){

            int A = sc.nextInt();

            if (A == 2) {
                toggle =0;
            }else if(A == 1 ){
                toggle = 1;
            } else {

                for (int j = 1; j < A; j++) {
                    JD = A % j;
                    if (j > 1 && JD == 0) {
                        toggle = 1;
                        break;
                    }
                }
            }
            if(toggle==1){
                count++;
            }
            toggle =0;

        }

        System.out.println(T-count);

    }


}
