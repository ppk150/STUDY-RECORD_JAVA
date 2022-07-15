import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220714_1_string {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        String[] ALPA = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int[] B = new int[26];

        int count = 0 ;

        int toggle = 1 ; // 그룹단어 아닌거 판명 났을때 플래그

        String compare = new String();

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            String A = sc.nextLine();
            String[] D = A.split("");

            int L = D.length;

            for (int j = 0; j < L; j++) {

                for (int k = 0; k < 26; k++) {// 해당 알파벳 들어간 갯수 셈

                    if (D[j].equals(ALPA[k])) {
                            B[k]++;
                    }
                }
            }

            for (int x = 0; x < 26 ; x ++){ // 중복 된 문자 판별 후 문자열 만드는 부분

                if(B[x]>1){
                    for (int w = 0 ; w < B[x] ; w++){
                        compare = compare + ALPA[x];
                    }
                    if (A.contains(compare)){ // 문자열 있나 없나 확인
                        toggle = 1; // 줄줄줄 문자 있을때 (그룹단어 맞음)
                        compare = "";
                    }else{
                        toggle = 0; // 줄줄줄 문자 없을때 (그룹단어 아님)
                        compare = "";
                        break;

                    }
                }

            }
            if(toggle == 0){
                count++;
            }
            toggle = 1;                  // 변수 초기화
            Arrays.fill(B,0);


        }

        System.out.println(T - count); //테스트 케이스 - 그룹단어 아닌 수
    }
}
