import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;

public class java_20220824_1_math {
    public static void main(String[] args) throws IOException  {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] TT = bf.readLine().split(" ");
        int[] T = new int[TT.length]; // N, M 받는곳
        int N = Integer.parseInt(TT[0]);// N 받음 (기존 도감 안의 수)
        int K = Integer.parseInt(TT[1]);// M 받음 (찾아야 하는 수)
        BigDecimal N_P = new BigDecimal("1");
        BigDecimal K_P = new BigDecimal("1");
        BigDecimal N_K_P = new BigDecimal("1");
        BigDecimal rest = new BigDecimal("10007");

        for(int i = 1 ;  i <= N ; i++){
            BigDecimal bigI =new BigDecimal(Integer.toString(i));
            N_P = N_P.multiply(bigI);
        }
        for(int i = 1 ;  i <= K ; i++){
            BigDecimal bigI =new BigDecimal(Integer.toString(i));
            K_P = K_P.multiply(bigI);
        }
        for(int i = 1 ;  i <= (N-K) ; i++){
            BigDecimal bigI =new BigDecimal(Integer.toString(i));
            N_K_P = N_K_P.multiply(bigI);
        }
        System.out.println(((N_P.divide((K_P.multiply(N_K_P))))).remainder(rest));

    }
}
