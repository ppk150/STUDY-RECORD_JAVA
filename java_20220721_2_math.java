import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220721_2_math {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] AF = bf.readLine().split(" ");

        int A = Integer.parseInt(AF[1]);
        int a = Integer.parseInt(AF[0]);
        int[] B = new int[A];
        Arrays.fill(B, 1);



        int j ;
        int ij ;
        int count = 0;
        int count_2 = 0;
        int end = 0;
        int num =A;

        int[] ERA = new int[A+1];
        Arrays.fill(ERA, 1);
        ERA[0] = 0;
        ERA[1] =0;
        int L = ERA.length;

        for (int i = 2 ; i < A ; i++){
            if (ERA[i] == 1){
                j=2;
                while (i*j <= A){
                    ij = i*j;
                    ERA[ij]=0;
                    j +=1;

                }
            }

        }
        int[] sosu = new int[L]; // 입력된 숫자 이하의 소수 다 저장

        for (int k = B[0]; k < L; k++){
            if (ERA[k]==1){
                sosu[count] = k;
                count++;
            }

        }
        int sosuL = sosu.length;


        for(int x = 0; x < sosuL ; x++){
            if (sosu[x] >= a) {
                System.out.println(sosu[x]);
            }
            if(sosu[x] == 0 ){
                break;
            }

        }


    }
}
