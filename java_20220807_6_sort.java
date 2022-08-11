import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220807_6_sort{

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T = Integer.parseInt(TT);
        int[] NUM = new int[T];
        int[] count = new int[8001];
        //ArrayList<Integer> sorted = new ArrayList<>();
        int[] sorted = new int[T];
        double sansul = 0;
        int count_sorted = 0;

        //------------------------숫자 입력---------------------------


        for (int j = 0; j < T; j++) {
            String N = bf.readLine();
            int num = Integer.parseInt(N);
            sansul = sansul + num; // 산술 평균을 위한 더하기 처리
            NUM[j] = num + 4000;
        }

        // -----------------------카운팅 정렬 ------------------------------

        for (int i = 0; i < T; i++) { // 숫자 등장 빈도수
            count[NUM[i]]++;
        }
        // -----------------------카운팅 정렬 ------------------------------

        int mode = findchibin(count);


        for (int i = 0; i < count.length; i++) { //들어온 숫자 정렬
            if (count[i] > 0) {
                for (int k = 0; k < count[i]; k++) {
                    sorted[count_sorted] = i - 4000; // 정렬된 수 배열 만들기
                    count_sorted++;
                }
            }
        }

        //------------------출력 ------------------

        // sorted를 배열로 했을 때
        bw.write(String.valueOf(Math.round(sansul/T)) + "\n"); //산술평균
        bw.write(String.valueOf(sorted[T / 2]) + "\n"); // 중앙값
        bw.write(String.valueOf(mode) + "\n"); // 최빈값
        bw.write(String.valueOf(sorted[T - 1] - sorted[0]) + "\n");//범위*/


        bw.flush();
        bw.close();
    }


    public static int findchibin(int[] arr) {
        int mode = 0;
        int modeMax = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (modeMax < arr[i]) {
                    modeMax = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (modeMax == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        return mode;
    }
}