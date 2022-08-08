import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class java_20220731_4_sort {

        public static void main(String[] args) throws IOException {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String TT = bf.readLine();
            int T  = Integer.parseInt(TT);
            int[] NUM = new int[T];
            int[] count = new int[10001];

            for (int j = 0 ; j < T ; j++){
                String N = bf.readLine();
                int  num  = Integer.parseInt(N);
                NUM[j] = num;
            }

            for(int i = 0 ; i <T ; i++){
                count[NUM[i]]++;
            }
            for(int i=1; i<=10000; i++) {
                if(count[i] != 0) {
                    for(int k=0; k<count[i]; k++) {
                        //System.out.println(i + " ");
                        bw.write(i+ " "+ "\n");
                    }
                }
            }
            bw.flush();
            bw.close();

/*
            Arrays.sort(NUM);

            for (int k = 0 ; k < T ; k++){
                //System.out.println(NUM[bw.write(NUM[k]+"\n");k]);
                bw.write(NUM[k]+"\n");
            }
            bw.flush();
            bw.close();*/

        }


}
