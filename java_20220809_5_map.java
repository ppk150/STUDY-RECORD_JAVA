import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class java_20220809_5_map {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();

        String[] TT = bf.readLine().split(" ");
        int[] T = new int[TT.length]; // N, M �޴°�
        int N = Integer.parseInt(TT[0]);// TT[0]
        int M = Integer.parseInt(TT[1]);// TT[1]
        int count = 0;

        String[] S =new String[N]; // ���� s �� ũ��
        String[] S_M =new String[M]; // �񱳵Ǵ� ����� �ִ� �迭

        for(int i = 0 ; i < N ; i++){ // ���� S
            S[i] = bf.readLine();
        }

        for(int i = 0 ; i < M ; i++){ // �񱳴�� �ؽ� ������ �ٲ����
            S_M[i] = bf.readLine();
            map1.put(i,S_M[i]); //key �κп� ���ڿ� ����
        }

        for(int i = 0 ; i < N ; i++){

            for(int j = 0 ; j < M ; j++){
                if(map1.get(j).equals(S[i]) ){
                    count++;
                }
            }

        }


        /*for(int i = 0 ; i < N ; i++){

            for(int j = 0 ; j < M ; j++){
                if(map1.containsKey(S[i]) ){
                    count++;
                }
            }

        }*/
        System.out.println(count);

    }
}
