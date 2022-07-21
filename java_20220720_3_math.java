import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java_20220720_3_math {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String AF = bf.readLine();
        String BF = bf.readLine();

        int A = Integer.parseInt(AF);
        int B = Integer.parseInt(BF);

        int AB = B - A;
        int JD = 0;

        int toggle = 0;
        int end = 0;
        int num = A;
        int sum = 0;
        int count = 0;

        int[] result = new int[AB+2];

        while (end == 0) {

            if (A == B) {
                for (int j = 1; j < num; j++) {
                    JD = num % j;
                    if (j > 1 && JD == 0) {
                        result[0] = 0;
                        break;
                    } else {
                        result[0] = A;
                        break;
                    }
                }
            }


                for (int j = 1; j < num; j++) {
                    JD = num % j;
                    if (j > 1 && JD == 0) {
                        toggle = 1;
                        break;
                    } else {
                        toggle = 0;
                    }
                }
                if (toggle == 0&&num!=1) {
                    result[count] = num;
                    count++;
                }
                num = num +1;
                if (num > B) {
                    break;
                }

            }



            for (int k = 0; k < AB+1; k++) {
                sum += result[k];
            }

            if (result[0] == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(result[0]); // 소수 1 걸러내야댐
            }

}

}
