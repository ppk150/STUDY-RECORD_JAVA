import java.io.*;
import java.util.HashMap;

public class java_20220822_1_math {
    public static void main(String[] args) throws IOException  {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] TT = bf.readLine().split(" ");
        int[] T = new int[TT.length]; // N, M 받는곳
        int N = Integer.parseInt(TT[0]);// N 받음 (기존 도감 안의 수)
        int K = Integer.parseInt(TT[1]);// M 받음 (찾아야 하는 수)
        long N_P = 1;
        long K_P = 1;
        long N_K_P = 1;

        for(int i = 1 ;  i <= N ; i++){
            N_P = N_P*i;
        }
        for(int i = 1 ;  i <= K ; i++){
            K_P = K_P*i;
        }
        for(int i = 1 ;  i <= (N-K) ; i++){
            N_K_P = N_K_P*i;
        }
        System.out.println((N_P/(K_P*N_K_P)));

    }
}
