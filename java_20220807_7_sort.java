import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220807_7_sort{

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] TT = bf.readLine().split(" ");
        int[] T = new int [2];
        int[] NUM = new int[T[0]];
        int[] count = new int[10001];

        int count_sorted = 0;


        for(int i = 0 ; i < 2; i++){
            T[i] = Integer.parseInt(TT[i]);
        } // �׽�Ʈ ���̽� , ĿƮ���� ��� �ڸ�
        int[] sorted = new int[T[0]];

        String[] student = bf.readLine().split(" ");
        int[] grade = new int[student.length];

        for(int j = 0 ; j < student.length ; j++ ){
            grade[j] =Integer.parseInt(student[j]);
            count[grade[j]]++;//count�� ����
        } // �л����� ���� ����



        for (int i = 0; i < count.length; i++) { //���� ���� ����
            if (count[i] > 0) {
                for (int k = 0; k < count[i]; k++) {
                    sorted[count_sorted] = i ; // ���ĵ� �� �迭 �����
                    count_sorted++;
                }
            }
        }

        System.out.println(sorted[T[0]-T[1]]);


    }

}