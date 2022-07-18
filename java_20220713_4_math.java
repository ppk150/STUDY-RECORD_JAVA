import javax.sql.rowset.serial.SQLInputImpl;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java_20220713_4_math {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] BF = bf.readLine().split(" ");

        int A = Integer.parseInt(BF[0]);
        int B = Integer.parseInt(BF[1]);
        int V = Integer.parseInt(BF[2]);

        int result = (V-B-1)/(A-B)+1;

        System.out.println(result);

    }
}

