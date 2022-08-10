import java.io.*;

public class java_20220809_1_force {
    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT); // M개의 카드
        String six ="";
        int start = 666;

        while(T-1 > 0){
            start++;
            six= Integer.toString(start);
            if(six.contains ( "666") ) {
                T--;
            }
        }
        System.out.println(start);
    }
}
