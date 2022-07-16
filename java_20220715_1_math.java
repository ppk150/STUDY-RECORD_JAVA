import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class java_20220715_1_math {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 순번 입력
        int count = 0 ;
        int linecount =0;
        int num = 0 ;
        int up = 0;
        int down = 0;


        for (int i = 0 ; i < T ; i++){ // 행 계산
            ++linecount;
            count = count+linecount;;
            if(count >= T){
                break;
            }
        }

        num = count - T;
        int line[] =new int[linecount];
        int linenum =linecount - num;

        for (int x = 0; x < linecount ; x ++){
            line[x]=x+1;
        }

        //Arrays.sort(line, Collections.reverseOrder());

        for (int j = 0;  j < linenum ; j++){ // 열 계산

            if (linecount%2 == 0){ //짝수일 때
                up = line[j];
                down = line[linecount-j-1];
            }else{                  // 홀수일때
                up = line[linecount-j-1];
                down = line[j];
            }
        }
        System.out.println(up+"/"+down);
    }
}
