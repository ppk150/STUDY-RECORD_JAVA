import java.io.InputStream;
import java.util.Scanner;

public class java_20220717_3_math {

    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();


        for (int i = 0; i < T ; i++){

            int k =sc.nextInt();
            int n =sc.nextInt();
            int result = 0;
            int count =1;
            int[][] APT = new int [k+1][15];

            for (int j = 0; j < 14; j++) { // 1행의 1 2 3 4 5 6 .... 채우기
                APT[0][j] = count++;
            }
            for (int q =0; q < k+1 ; q++){  // 1열에 1 1 1 1 1 ... 채우기
                APT[q][0] = 1;
            }

                for (int y = 1; y < k+1; y++) { // 이 부분 수정 필요, k가 1일때 대응

                    for (int x = 1; x < n; x++) {
                        APT[y][x] = APT[y - 1][x] + APT[y][x - 1]; // 호수에 따른 인원수 구하기
                        // 구하고자 하는 자리의 수 = 한칸 왼쪽 자리 + 한칸 아래 자리
                    }

                }


            result= APT[k][n-1];
            System.out.println(result);

        }

    }
}