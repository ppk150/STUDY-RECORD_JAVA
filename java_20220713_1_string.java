import java.io.InputStream;
import java.util.Scanner;

public class java_20220713_1_string {
    public static void main(String[] args) {
        InputStream in = System .in;
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String[] B = A.split("");

        int T = B.length;
        int count = 0;

        for (int i =0 ; i < T-1 ; i++){

            if((B[i]+B[i+1]).equals("c=")){

                count = count +1;

            } else if ((B[i]+B[i+1]).equals("c-")) {
                count = count +1;
            }else if ((B[i]+B[i+1]).equals("d-")) {
                count = count +1;
            }else if ((B[i]+B[i+1]).equals("lj")) {
                count = count +1;
            }else if ((B[i]+B[i+1]).equals("nj")) {
                count = count +1;
            }else if ((B[i]+B[i+1]).equals("s=")) {
                count = count +1;
            }else if ((B[i]+B[i+1]).equals("z=")) {
                if (i>=1&&(B[i-1]+B[i]+B[i+1]).equals("dz=")){
                    count = count+2;
                }else {
                    count = count+1;
                }

            }

        }
        System.out.println(T-count);
    }

}
