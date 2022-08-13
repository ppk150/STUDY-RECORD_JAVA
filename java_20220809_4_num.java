import java.io.*;
import java.util.Arrays;

public class java_20220809_4_num {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String TT = bf.readLine();
        int T = Integer.parseInt(TT);// TT[0]
        int result = 0;

        int end = 0;

        String[] NUM = bf.readLine().split(" "); // 숫자 입력 받음
        int[] N = new int[NUM.length];
        for(int i = 0 ; i < NUM.length ; i++) {
            N[i] = Integer.parseInt(NUM[i]);// TT[0]
        }

        Arrays.sort(N);

        if(T == 1){
            result = N[0]*N[0];
        }else{
            result = N[0]*N[T-1];
        }
        System.out.println(result);

    }
}
