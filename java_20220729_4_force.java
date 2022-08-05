import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_20220729_4_force {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String TT = bf.readLine();
        int T = Integer.parseInt(TT); // 테스트 케이스
        int[] bodyinfo = new int[2*T];
        int x = 0;
        int y = 0;

        for (int k = 0; k < T; k++) { // bodyinfo에 인적사항 넣는 코드
            String AF = bf.readLine();
            String[] body = AF.split(" "); // 숫자 받아서 배열로
            bodyinfo[2*k] = Integer.parseInt(body[0]);
            bodyinfo[2*k+1] = Integer.parseInt(body[1]);


        }

        for(int i = 0; i < T; i++){
            int count =1;
            for(int j =0 ; j < T ; j++){
                if(bodyinfo[2*i] < bodyinfo[2*j]&&bodyinfo[2*i+1] < bodyinfo[2*j+1]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
