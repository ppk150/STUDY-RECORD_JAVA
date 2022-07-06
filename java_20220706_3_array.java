import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class java_20220706_3_array {

    public static void main(String[] args) {

        InputStream in = System.in ;
        Scanner sc = new Scanner(System.in);

        int A, B, C, total, count , num ;

        int[] T = {0,1,2,3,4,5,6,7,8,9};

        int[] Num = new int[10];

        count =0 ;

        A = sc.nextInt();

        B = sc.nextInt();

        C = sc.nextInt();

        total = A * B * C;

        String s = Integer.toString(total);

        int length;

        length = s.length();

        int[] D = new int[length];
        D = Stream.of(s.split("")).mapToInt(Integer::parseInt).toArray();



        for (int k = 0; k < 10 ; k++) {
            count =0 ;

            for (int i = 0 ; i < length; i++ ){

                if (T[k] == D[i] ) { // 이 조건문을 고쳐야 함, 1~9까지 숫자와 곱한 숫자( total )를 비교하는 것
                    count++;

                }

            }
            Num[k]=count++;

        }

        for ( int j = 0 ; j < 10 ; j++ ){
            System.out.println(Num[j]);
        }



    }
}
