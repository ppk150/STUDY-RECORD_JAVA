import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class java_20220729_3_force {

    public static void main(String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String AF = bf.readLine();
        int A = Integer.parseInt(AF);
        int T = 0;

        int end = 0;


        while(end == 0){
            int sum= 0;
            int[] arrNum = Stream.of(String.valueOf(T).split("")).mapToInt(Integer::parseInt).toArray();
            int L = arrNum.length;


            for (int i = 0 ; i < L ; i++){
                sum +=arrNum[i];
            }
            if (sum + T == A){

                end = 1;
                break;
            }else {
                T = T + 1;
            }

            if(T > A){
                T = 0;
                end = 1;
                break;
            }
        }
        System.out.println(T);

    }

}
