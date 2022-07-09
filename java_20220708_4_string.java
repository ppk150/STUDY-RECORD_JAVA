import java.io.InputStream;
import java.util.Scanner;

public class java_20220708_4_string {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        String A = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\\$%*+-./:";
        String[] B = A.split("");


        int T , R , L, count ;

        T = sc.nextInt();

        for (int i = 0 ; i < T ; i ++){

            R = sc.nextInt();

            String C = sc.next(); // 입력받을 구문 받는 배열
            String[] D = C.split("");
            L = D.length;


                String[] result = new String[L];

                for (int j = 0 ; j < L ; j++ ){


                    for (int h = 0 ;h < 45 ; h ++ ){

                        if (D[j].equals(B[h])){

                            result[j] = B[h];
                            break;

                        }
                    }

                    }

                for (int x = 0; x < L ;x ++) {
                    for(int z = 0; z < R ;z ++ ){
                        System.out.print(result[x]);

                    }

                }System.out.println(); // 개행문자 씨봉방거

        }

    }
}
