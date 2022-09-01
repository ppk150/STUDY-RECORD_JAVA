import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220811_3_Geo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int[] X = new int[3];
        int[] Y = new int[3];
        int countX = 0;
        int countY = 0;

        //String[] Test =new String[6];
        for(int i = 0 ; i < 3 ; i++) {

            X[i] = sc.nextInt(); // 3개 받은 숫자 중 다른 하나를 내놓으면 됨
            Y[i] = sc.nextInt();
        }

        if (X[0]==X[1]){
            countX = X[2];
        }
        if (X[2]==X[1]){
            countX = X[0];
        }
        if (X[2]==X[0]){
            countX = X[1];
        }

        if (Y[0]==Y[1]){
            countY = Y[2];
        }
        if (Y[2]==Y[1]){
            countY = Y[0];
        }
        if (Y[2]==Y[0]){
            countY = Y[1];
        }


        System.out.println(countX+" "+ countY);

    }
}
