import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class java_20220719_1_math {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ALL = bf.readLine();
        String[] ALLL = ALL.split(" "); // 숫자 받아서 배열로

        String[] A = ALLL[0].split(""); // 숫자 받아서 배열로
        ArrayList<String> AA = new ArrayList<String>(Arrays.asList(A));


        String[] B = ALLL[1].split(""); // 숫자 받아서 배열로
        ArrayList<String> BA = new ArrayList<String>(Arrays.asList(B));

        String result = "";

        int LA = A.length; // 두 숫자 길이

        int LB = B.length;

        int end = 0 ; // while 빠져나오게 하는거

        int count = 1; //자리수 세는 숫자

        int countspotA = 0;
        int countspotB = 0;

        int one = 0; // 더할 때 올림이 나올 때 사용

        int a = 0;


        while (end == 0) {
            countspotA = LA - count;
            countspotB = LB - count;

                if (countspotA <= 0 && countspotB >= 0) {
                    if(countspotA == 0){
                        a = Integer.parseInt(AA.get(countspotA)) + Integer.parseInt(BA.get(countspotB)) + one;
                        result += Integer.toString(a % 10);

                    }else {
                        a = Integer.parseInt(BA.get(countspotB)) + one;
                        result += Integer.toString(a % 10);
                    }

                } else if (countspotA >= 0 && countspotB <= 0) {
                    if (countspotB == 0) {
                        a = Integer.parseInt(AA.get(countspotA)) + Integer.parseInt(BA.get(countspotB)) + one;
                        result += Integer.toString(a % 10);

                    } else {
                        a = Integer.parseInt(AA.get(countspotA)) + one;
                        result += Integer.toString(a % 10);
                    }
                }

                if (countspotA > 0 && countspotB > 0){
                    a = Integer.parseInt(AA.get(countspotA)) + Integer.parseInt(BA.get(countspotB)) + one;
                    result += Integer.toString(a % 10); // 더한 숫자가 10이 넘을 경우를 대비해 10의 나머지, 10넘으면 one을 나중에 더함
                }

                if (a >= 10) {
                    one = 1;
                } else {
                    one = 0;
                }

            // 뒷자리부터 더함
            if (countspotA < 0 && countspotB < 0) {
                break;
            }

            if (countspotA == 0 && countspotB <= 0 ||countspotA <= 0 && countspotB == 0 ) { // 끝부분으로 수정

                if (one == 1) {
                    result += "1"; // 다 더하고 마지막 숫자 더햇을때 10 넘을때
                }

            }

            count++;
        }
        StringBuffer sb = new StringBuffer(result);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

    }
}
