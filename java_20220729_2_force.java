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
        String[] NMM = NM.split(" "); // N, M ����

        int N = Integer.parseInt(NMM[0]);
        int M = Integer.parseInt(NMM[1]);

        String CARDIN = bf.readLine();
        String[] CARDstr = CARDIN.split(" "); // CARD �޾Ƽ� �迭�� �ǵ�

        int L = CARDstr.length;
        int[] CARD = new int[L];

        for (int a =0 ; a < L ; a++){
            CARD[a] = Integer.parseInt(CARDstr[a]);
        }
        Arrays.sort(CARD);

        ArrayList<Integer> sumALL = new ArrayList<Integer>();
        int sum = 0; // �迭�� ���� ���� �ֵ� �ְ�, ������ �������� ���� �� if ������ ������ �ɵ�
        int end = 0;

        if(N != 3) {


            for (int i = 0; i < L; i++) {
                for (int j = i + 1; j < L; j++) {
                    for (int k = j + 1; k < L; k++) {
                        if (CARD[i] + CARD[j] + CARD[k] <= M) {
                            sum = CARD[i] + CARD[j] + CARD[k]; //���Ѱ� �ϴ�
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


            // sumALL �������� �� ù��°�� ���� �ϸ� ��
            Collections.sort(sumALL, Collections.reverseOrder() );


            System.out.println(sumALL.get(0));
        }else{
            System.out.println(CARD[0] + CARD[1] + CARD[2]);
        }

    }
}
