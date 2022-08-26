import java.io.*;
import java.util.Arrays;

public class java_20220811_2_Geo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] Test = bf.readLine().split(" ");

        int[] zero ={0,0};
        int[] hansu = {Integer.parseInt(Test[0]),Integer.parseInt(Test[1])};
        int[] WH = {Integer.parseInt(Test[2]),Integer.parseInt(Test[3])};

        int[] len =new int[4];


        len[0] = WH[0] - hansu[0];

        len[1] = hansu[0];

        len[2] = hansu[1];

        len[3] = WH[1] - hansu[1];

        Arrays.sort(len);

        System.out.println(len[0]);

    }
}
