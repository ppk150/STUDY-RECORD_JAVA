import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class If_time {

    public static void main(String[] args )throws IOException{

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int H, M ,Total, Totalmodify, TH , TM ;

        H = sc.nextInt();

        M = sc.nextInt();

        Total = H*60+M;

        Totalmodify = Total-45;

        TH = Totalmodify /60;

        TM = Totalmodify %60;

        if (TH <= 0 && Totalmodify < 0) {
            TH = 23;
        }

        if (TM < 0 ){

            TM = 60 + TM;
        }
        if (TH <= 0 && Totalmodify > 0 ) {
            TH = 0;
        }

        System.out.println(TH +" "+ TM);

    }

}
