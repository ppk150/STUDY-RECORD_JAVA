import java.io.InputStream;
import java.util.Scanner;

public class java_20220704_3_if {
    public static  void main(String args[]){
        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int H, M, Cook , total , time , H_done, M_done ;

        H = sc.nextInt();

        M = sc.nextInt();

        Cook = sc.nextInt();

        time = H*60+M;

        total = time + Cook;

        H_done = total /60;

        M_done = total %60;


        if (H_done<= 0 && total >0||H_done== 24){
            H_done =0;
        }

        if (H_done> 24){
            H_done = H_done -24;
        }

        System.out.println(H_done + " "+M_done);


    }
}
