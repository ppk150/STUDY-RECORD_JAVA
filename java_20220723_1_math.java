import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220723_1_math {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //String AF = bf.readLine();

        int end = 0;

        while(end == 0) {

            String ALL = bf.readLine();
            int A = Integer.parseInt(ALL);
            int a = 2 * A;
            int[] B = new int[A];
            Arrays.fill(B, 1);
            if(A ==0){
                end = 1;
                break;

            }


            int j;
            int ij;
            int count = 0;
            int count_2 = 0;

            int num = A;

            int[] ERA = new int[a + 1];
            Arrays.fill(ERA, 1);
            ERA[0] = 0;
            ERA[1] = 0;
            int L = ERA.length;

            for (int i = 2; i < a; i++) {
                if (ERA[i] == 1) {
                    j = 2;
                    while (i * j <= a) {
                        ij = i * j;
                        ERA[ij] = 0;
                        j += 1;

                    }
                }

            }
            int[] sosu = new int[L]; // 입력된 숫자 이하의 소수 다 저장

            for (int k = B[0]; k < L; k++) {
                if (ERA[k] == 1) {
                    sosu[count] = k;
                    count++;
                }

            }
            int sosuL = sosu.length;


            for (int x = 0; x < sosuL; x++) {
                if (sosu[x] > A) {
                    count_2++;
                }
                if (sosu[x] == 0) {
                    System.out.println(count_2);
                    break;
                }

            }


        }


    }
}
