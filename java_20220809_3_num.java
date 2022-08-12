import java.io.*;

public class java_20220809_3_num {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int end = 0;

        while(end==0) {

            String[] TT = bf.readLine().split(" ");
            int[] T = new int[TT.length]; // N, M ¹Þ´Â°÷
            int N = Integer.parseInt(TT[0]);// TT[0]
            int M = Integer.parseInt(TT[1]);// TT[1]

            if(N==0&& M == 0){
                end = 1;
                break;
            }

            if(M/N != 0 && M%N==0){
                System.out.println("factor");
            }else if(N/M != 0 && N%M==0){
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }

        }
    }
}
