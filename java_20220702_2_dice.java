import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;


public class java_20220702_2_dice {

    public static void main (String agrs[])throws IOException{

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int D1, D2, D3, prize ;

        prize = 0;

        D1 = sc.nextInt();
        D2 = sc.nextInt();
        D3 = sc.nextInt();

        int[] Dice = {D1,D2,D3};

        Arrays.sort(Dice);


        if (D1==D3&&D1==D2&&D2==D3){ // 3개 다 같을 때
            prize=10000+1000*D1;
        }


        if(D1==D2&&D1!=D3){  // 2개만 같을 때
            prize=1000+100*D1;
        } else if (D2==D3&&D2!=D1) {
            prize=1000+100*D2;
        } else if (D3==D1&&D3!=D2) {
            prize=1000+100*D3;
        }

        if (D1!=D2&&D2!=D3&&D1!=D3){  //3개 모두 다를 때 (이 중 큰 수 찾아내는 작업 필요)
            prize=100*Dice[2];
        }

        System.out.println(prize);

    }


}
