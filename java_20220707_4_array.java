import java.io.InputStream;
import java.util.Scanner;

public class java_20220707_4_array {

    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T;

        float sum , count , M, result;

        sum = 0;

        count =0;

        result = 0;

        T = Integer.parseInt(sc.nextLine()); // 테스트 케이스 수 지정


        for (int i =0; i < T ; i++){ // 테스트 케이스 수 만큼 for문 돌림

            String A = sc.nextLine();
            String[] B = A.split(" "); // 학생의 수 B[0], 그 이후거가 점수

            int length = B.length;   // 받은 배열 길이 구하기

            for (int k = 1 ; k < length ; k++){  // 배열 안의 점수 더하기

                sum = sum + Float.parseFloat(B[k]);

            }

            M = sum / (length-1);  // 평균 내기

            for (int j = 1; j < length ; j++ ) {   // 평균보다 높은 인원 수 구하기
                if (Integer.parseInt(B[j]) > M) {

                    count++;
                }
            }

            result = (count /(length-1) *100); // 백분률 구하기

            System.out.println(String.format("%.3f", result) + "%");
            count =0;
            sum = 0;
            M = 0;


        }

    }
}
