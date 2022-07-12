import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class java_20220712_1_string {

    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int[] ALPA = new int[26]; // 알파벳 대, 소문자 넣는 아스키 코드 크기
        int max = ALPA[0];
        char result = 0;


        String[] A = sc.next().toUpperCase().split("");


        int T;

        T = A.length; // 짤짤이 길이를 지정

        for (int i = 0 ; i <T ; i++){ // 알파벳 대, 소문자에 해당하는 문자를 해당 자리에 넣음

            ALPA[A[i].charAt(0) - 'A']++;

        }
        for (int k = 0 ; k <26; k++){
            if (ALPA[k]> max){
                max = ALPA[k];
                result =(char)(k +65);

            }else if (ALPA[k] == max){ // 같은값이 있으면 ? 출력

                result = '?';

            }

        }
        System.out.println(result); // 출력


    }


}
