import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220807_6_sort{

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T = Integer.parseInt(TT);
        int[] NUM = new int[T];
        int[] count = new int[8001];
        //ArrayList<Integer> sorted = new ArrayList<>();
        int[] sorted = new int[T];
        double sansul = 0;
        int count_sorted = 0;

        //------------------------���� �Է�---------------------------


        for (int j = 0; j < T; j++) {
            String N = bf.readLine();
            int num = Integer.parseInt(N);
            sansul = sansul + num; // ��� ����� ���� ���ϱ� ó��
            NUM[j] = num + 4000;
        }

        // -----------------------ī���� ���� ------------------------------

        for (int i = 0; i < T; i++) { // ���� ���� �󵵼�
            count[NUM[i]]++;
        }
        // -----------------------ī���� ���� ------------------------------

        int mode = findchibin(count);


        for (int i = 0; i < count.length; i++) { //���� ���� ����
            if (count[i] > 0) {
                for (int k = 0; k < count[i]; k++) {
                    sorted[count_sorted] = i - 4000; // ���ĵ� �� �迭 �����
                    count_sorted++;
                }
            }
        }

        //------------------��� ------------------

        // sorted�� �迭�� ���� ��
        bw.write(String.valueOf(Math.round(sansul/T)) + "\n"); //������
        bw.write(String.valueOf(sorted[T / 2]) + "\n"); // �߾Ӱ�
        bw.write(String.valueOf(mode) + "\n"); // �ֺ�
        bw.write(String.valueOf(sorted[T - 1] - sorted[0]) + "\n");//����*/


        bw.flush();
        bw.close();
    }


    public static int findchibin(int[] arr) {
        int mode = 0;
        int modeMax = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (modeMax < arr[i]) {
                    modeMax = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (modeMax == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        return mode;
    }
}