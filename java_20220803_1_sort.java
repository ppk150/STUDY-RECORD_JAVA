import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class java_20220803_1_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //String TT = bf.readLine();

        String[] AF = bf.readLine().split("");
        int L = AF.length;

        BigDecimal[] NUM = new BigDecimal[L];

        for (int j = 0 ; j < L ; j++){
            int T  = Integer.parseInt(AF[j]);
            NUM[j] = BigDecimal.valueOf(T);
        }

        Arrays.sort(NUM);

        for (int k = 0 ; k < L ; k++){
            bw.write(String.valueOf(NUM[L-k-1]));
        }
        bw.flush();
        bw.close();

    }

}
