import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class java_20220731_3_sort {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT);
        int[] NUM = new int[T];

        for (int j = 0 ; j < T ; j++){
            String N = bf.readLine();
            int num  = Integer.parseInt(N);
            NUM[j] = num;
        }

        for(int i = 1 ; i < T ; i++){
            for(int j = 0 ; j < T-i ; j++){
                if (NUM[j] > NUM[j+1] ){
                    int temp = NUM[j];
                    NUM[j] = NUM[j+1];
                    NUM[j+1] = temp;

                }

            }

        }

        for (int x = 0 ; x < T ; x++){
            System.out.println(NUM[x]);
        }



        //Arrays.sort(NUM);

        //for (int j = 0 ; j < T ; j++){
        //    System.out.println(NUM[j]);
        //}

    }
}
