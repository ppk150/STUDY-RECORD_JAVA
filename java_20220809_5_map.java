import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class java_20220809_5_map {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();

        String[] TT = bf.readLine().split(" ");
        int[] T = new int[TT.length]; // N, M 받는곳
        int N = Integer.parseInt(TT[0]);// TT[0]
        int M = Integer.parseInt(TT[1]);// TT[1]
        int count = 0;

        String[] S =new String[N]; // 집합 s 의 크기
        String[] S_M =new String[M]; // 비교되는 대상을 넣는 배열

        for(int i = 0 ; i < N ; i++){ // 집합 S
            S[i] = bf.readLine();
        }

        for(int i = 0 ; i < M ; i++){ // 비교대상 해쉬 맵으로 바꿔야함
            S_M[i] = bf.readLine();
            map1.put(i,S_M[i]); //key 부분에 문자열 저장
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
