import java.io.*;

public class java_20220808_3_map {
    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT); // M���� ī��
        int[] NUM = new int[T];
        int[] count = new int[20000001];



        //-------------���� ī�� �Է� ------------------------------
        String[] AF = bf.readLine().split(" ");

        for (int j = 0 ; j < T ; j++){ // M���� ���� ī�� (-10000000 ���� �־�� �Ǽ� +10000000 ��)

            int  num  = Integer.parseInt(AF[j]);
            NUM[j] = num+10000000;
        }

        String TT_2 = bf.readLine();
        int T_2  = Integer.parseInt(TT_2); // ����̰� ���� ī���� ��
        int[] NUM_2 = new int[T_2];
        int[] result = new int[T_2]; // ī�� ���� ��� �κ�
        String[] AF_2 = bf.readLine().split(" ");


        for (int j = 0 ; j < T_2 ; j++){ // ����̰� ������ �ִ� ���� ī��
            int  num  = Integer.parseInt(AF_2[j]);
            NUM_2[j] = num;
        }

//---------------------------------���� ī�� ī���� ���� ---------------------
        int[] sorted = new int[T];
        int count_sorted = 0;
        for(int i = 0 ; i <T ; i++){ // M���� ����ī�� ����
            count[NUM[i]]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] >= 0) {
                for(int k=0; k<count[i]; k++) {

                    sorted[count_sorted] = i - 10000000; // ���ĵ� �� �迭 �����
                    count_sorted++;
                }
            }
        }
        //--------------------------------�̺� Ž��-------------------------------


        for(int i = 0 ; i < T_2 ; i++){
            int count_by =1;
            int spot = T-1; // �̺�Ž������ �߰� ������ ������ �Ǵ� ����

            for(int j = 0 ; j < T ; j++) {
                if (NUM_2[i] > sorted[spot]) {

                    spot = spot + T / (count_by * 2);


                } else if (NUM_2[i] < sorted[spot]) {

                    spot = spot / (count_by * 2);

                } else if (NUM_2[i] == sorted[spot]) {
                    result[i] = 1;
                    break;
                }

                if (spot == 0 && NUM_2[i] != sorted[spot]) {
                    result[i] = 0;
                    break;
                }
            }
            bw.write(result[i]+ " ");
        }
        bw.flush();
        bw.close();
    }
}
