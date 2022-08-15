import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class java_20220810_3_num {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String Test = bf.readLine();
        int T = Integer.parseInt(Test);// TT[0] 첫번째 숫자
        int[] num = new int[T];
        int result =0;
        String[] N = bf.readLine().split(" ");

        for(int i = 0 ; i < T ; i++){
            num[i] = Integer.parseInt(N[i]);
        }
        int end = 0;
        int[] gongyak = new int[T];

        for(int i = 1 ; i < T ; i++) {

            //----------------------최대공약수--------------
            int first = num[0];
            int second = num[i];

            while (end == 0) {

                if (first % second == 0) {
                    gongyak[i] = second;
                    break;
                } else if (second % first == 0) {
                    gongyak[i] = first;
                    break;
                }

                if (first > second) {
                    first = first % second;
                } else if (first < second) {
                    second = second % first;
                }

            }
            int RR = num[0];
            //------------------------최대공약수 끝-----------

            if (gongyak[i] == 1) {
                    bw.write((RR) + "/" + (num[i])+"\n");
            } else {
                bw.write((RR / gongyak[i]) + "/" + (num[i] / gongyak[i]) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}


