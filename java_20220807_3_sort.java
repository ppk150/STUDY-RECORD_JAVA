import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class java_20220807_3_sort {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT);
        BigDecimal[] NUM = new BigDecimal[T];

        for (int j = 0 ; j < T ; j++){
            String N = bf.readLine();
            int  num  = Integer.parseInt(N);
            NUM[j] = BigDecimal.valueOf(num);
        }

        Arrays.sort(NUM);

        for (int k = 0 ; k < T ; k++){
            //System.out.println(NUM[k]);
            bw.write(NUM[k]+"\n");


        }
        bw.flush();
        bw.close();

    }


}
