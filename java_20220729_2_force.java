import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class java_20220729_2_force {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String NM = bf.readLine();
        String[] NMM = NM.split(" "); // N, M 받음

        int N = Integer.parseInt(NMM[0]);
        int M = Integer.parseInt(NMM[1]);

        String CARDIN = bf.readLine();
        String[] CARDstr = CARDIN.split(" "); // CARD 받아서 배열로 맨듬

        int L = CARDstr.length;
        int[] CARD = new int[L];

        for (int a =0 ; a < L ; a++){
            CARD[a] = Integer.parseInt(CARDstr[a]);
        }
        Arrays.sort(CARD);

        ArrayList<Integer> sumALL = new ArrayList<Integer>();
        int sum = 0; // 배열로 만들어서 더한 애들 넣고, 오름순 차순으로 정렬 후 if 문으로 꺼내면 될듯
        int end = 0;

        if(N != 3) {


            for (int i = 0; i < L; i++) {
                for (int j = i + 1; j < L; j++) {
                    for (int k = j + 1; k < L; k++) {
                        if (CARD[i] + CARD[j] + CARD[k] <= M) {
                            sum = CARD[i] + CARD[j] + CARD[k]; //더한거 싹다
                            sumALL.add(sum);
                        }
                    }
                    if (end == 1) {
                        break;
                    }
                }
                if (end == 1) {
                    break;
                }
            }


            // sumALL 내림차순 후 첫번째꺼 ㄱㄱ 하면 됨
            Collections.sort(sumALL, Collections.reverseOrder() );


            System.out.println(sumALL.get(0));
        }else{
            System.out.println(CARD[0] + CARD[1] + CARD[2]);
        }

    }
}
