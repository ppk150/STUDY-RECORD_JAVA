import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class java_20220821_2_map {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        //Map<String, Object> hashMap = new HashMap();

        String[] TT = bf.readLine().split(" ");
        int[] T = new int[TT.length]; // N, M �޴°�
        int N = Integer.parseInt(TT[0]);// N ���� (���� ���� ���� ��)
        int M = Integer.parseInt(TT[1]);// M ���� (ã�ƾ� �ϴ� ��)
        int count = 0;

        String[] S = new String[M]; // ���� s �� ũ��
        String[] S_N = new String[N + 1]; // �񱳵Ǵ� ����� �ִ� �迭


        for (int i = 1; i < N + 1; i++) { // ó�� ���� ������ �� ������ �ǵ�
            S_N[i] = bf.readLine();
            map1.put(Integer.toString(i), S_N[i]); //key �κп� ����, value �κп� ��
            map2.put(S_N[i], Integer.toString(i)); //key �κп� ����, value �κп� ��
        }

        for (int i = 0; i < M; i++) { // ã�ƾ� �ϴ� ���� N
            S[i] = bf.readLine();
        }

        // -------------- key, value�� ���� ��� �ʿ�


        /*for (int i = 0; i < M; i++) { // ���°� ���ڸ� value����, ���ڿ��̸� key����

            for (int j = 1; j < N + 1; j++) {

                if (map1.get(Integer.toString(j)).equals(S[i])) {
                    System.out.println(j);
                    break;
                } else if (map1.containsKey((S[i]))) {
                    System.out.println(map1.get(S[i]));
                    break;
                }
            }

        }*/

        for (int i = 0; i < M; i++) { // ���°� ���ڸ� value����, ���ڿ��̸� key����

                //���� ������ ���ڷ�
                    if (map1.containsKey((S[i]))) { // ���� ������ ���ڷ�
                    System.out.println(map1.get(S[i])); //value ����
                    //break;
                }
                    if(map2.containsKey((S[i]))){
                        System.out.println(map2.get(S[i]));
                        }


        }


    }
}
