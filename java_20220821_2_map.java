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
        int[] T = new int[TT.length]; // N, M 받는곳
        int N = Integer.parseInt(TT[0]);// N 받음 (기존 도감 안의 수)
        int M = Integer.parseInt(TT[1]);// M 받음 (찾아야 하는 수)
        int count = 0;

        String[] S = new String[M]; // 집합 s 의 크기
        String[] S_N = new String[N + 1]; // 비교되는 대상을 넣는 배열


        for (int i = 1; i < N + 1; i++) { // 처음 들어온 도감의 값 맵으로 맨듦
            S_N[i] = bf.readLine();
            map1.put(Integer.toString(i), S_N[i]); //key 부분에 순서, value 부분에 값
            map2.put(S_N[i], Integer.toString(i)); //key 부분에 순서, value 부분에 값
        }

        for (int i = 0; i < M; i++) { // 찾아야 하는 도감 N
            S[i] = bf.readLine();
        }

        // -------------- key, value에 따라 출력 필요


        /*for (int i = 0; i < M; i++) { // 들어온게 숫자면 value값을, 문자열이면 key값을

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

        for (int i = 0; i < M; i++) { // 들어온게 숫자면 value값을, 문자열이면 key값을

                //문자 넣으면 숫자로
                    if (map1.containsKey((S[i]))) { // 숫자 넣으면 문자로
                    System.out.println(map1.get(S[i])); //value 츨력
                    //break;
                }
                    if(map2.containsKey((S[i]))){
                        System.out.println(map2.get(S[i]));
                        }


        }


    }
}
