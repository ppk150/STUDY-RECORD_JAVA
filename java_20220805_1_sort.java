import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class java_20220805_1_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T = Integer.parseInt(TT);

        int[] NUM = new int[2 * T];
        int[] odd = new int [T];
        int[] even = new int [T];

        int[] count = new int[10001];
        int[] sorted = new int[T];

        int count_sorted = 0;

        String[] AF = new String[0];

        for (int i = 0; i < T; i++) {  // 좌표 입력 -> 한줄로 쥬르륵 , 짝수 X, 홀수 Y 좌표
            for(int j = 0; j < 1; j++){
                AF = bf.readLine().split(" ");
            }
            NUM[2*i] = Integer.parseInt(AF[0]);
            odd[i] = Integer.parseInt(AF[0]);
            NUM[2*i+1] = Integer.parseInt(AF[1]);
            count[odd[i]]++;
            //even[i] = Integer.parseInt(AF[1]);
        }
        //Arrays.sort(odd);

        for (int i = 0; i < count.length; i++) { //들어온 숫자 정렬
            if (count[i] > 0) {
                for (int k = 0; k < count[i]; k++) {
                    sorted[count_sorted] = i ; // 정렬된 수 배열 만들기
                    count_sorted++;
                }
            }
        }


        for(int k=0 ; k < T ; k++){
            for(int g = k ; g < 2*T-1 ; g++) {
                if (sorted[k] == NUM[g]) {
                    even[k] = NUM[g+1];
                }
            }
        }

        for (int x = 0; x < T; x++) {
            System.out.println(sorted[x] + " " + even[x]);
        }


    }
}
