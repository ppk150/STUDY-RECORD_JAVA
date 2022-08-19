import java.io.*;
import java.util.Scanner;

public class java_20220819_1_sum {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] NUM = bf.readLine().split(" "); // 숫자 입력 받음
        int[] N = new int[NUM.length];
        for(int i = 0 ; i < NUM.length ; i++) {
            N[i] = Integer.parseInt(NUM[i]);// TT[0]
        }

        System.out.print(1-N[0]+" ");
        System.out.print(1-N[1]+" ");
        System.out.print(2-N[2]+" ");
        System.out.print(2-N[3]+" ");
        System.out.print(2-N[4]+" ");
        System.out.print(8-N[5]+" ");


    }
}
