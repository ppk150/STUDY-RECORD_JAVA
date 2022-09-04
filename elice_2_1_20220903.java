import java.io.*;
import java.util.Scanner;

public class elice_2_1_20220903 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        String[] TT = sc.nextLine() .split(" "); //초반 글자 수, 연산 횟수


        String[] x = sc.nextLine() .split(" ");

        String[] comp = new String[x.length];




        String[] result = new String[x.length];


        int Q = 0;
        int Q_2 = 0;

        for(int i = 0 ; i < Integer.parseInt(TT[1])  ; i++){


            Q = sc.nextInt();
//
            if (Q == 2) {
                Q_2 = sc.nextInt();

                System.arraycopy(x , x.length-Q_2  ,comp , 0, Q_2 );
                System.arraycopy(x , 0  ,comp, Q_2, x.length-Q_2 );


            }
            else if (Q == 1){
                for(int j = 0 ; j < x.length  ; j++){
                    comp[j] = x[x.length-j-1];
                }
            }

            for(int t = 0 ; t < x.length ; t ++){
                x[t] = comp[t];
            }

        }

        for(int j = 0 ; j < x.length  ; j++) {
            System.out.print(x[j] + " ");
        }


    }
}
