import java.io.*;

public class java_20220808_4_map {
    public static long[] NUM;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] TT = bf.readLine().split(" ");
        long[] T = new long[TT.length]; // // ���� ��, �ʿ� ���� �޴� ��
        int t = Integer.parseInt(TT[0]);// TT[0] -> ���� ��
        long len = Long.parseLong(TT[1]);// TT[1]  �ʿ� ����

        NUM = new long[t];
        long max = 0;



        //-------------���� ���� �Է� ------------------------------

        String[] AF = bf.readLine().split(" ");

        for (int j = 0; j < t; j++) {

            long num = Long.parseLong(AF[j]);
            NUM[j] = num;
            if (max < NUM[j]) {
                max = NUM[j]; // �ִ� ����
            }
        }
        binarySearch(max,len);

    }


    //--------------------------------�̺� Ž��-------------------------------

    public static void binarySearch( long max, long target) { // �̺�Ž��
        long start = 0; // ������
        long end = max; // ����
        long mid; // �߾�

        while (start + 1 < end) { // ���۰� ������ ������ ������
            mid = (start + end) / 2;

            if (cutterDetermin(mid) >= target) // �ڸ� ���� ��ǥ������ ũ�ų� ������
                start = mid;
            else {
                end = mid;
            }
        }
        System.out.println(start);
    }

    public static long cutterDetermin(long mid) { // ���ܱ�� �ڸ� ���� ���� ����Ͽ� ��ȯ
        long sum = 0;

        for (int i = 0; i < NUM.length; i++) {
            if (NUM[i] - mid > 0) {
                sum += (NUM[i] - mid);
            }
        }
        return sum;
    }
}

