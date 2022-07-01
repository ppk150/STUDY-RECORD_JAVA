

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public void dan(int n){

        for (int i = 1 ; i < 10 ; i++){
            System.out.println(n +" * "+ i+" = " + n*i);
        }
    }


    public static void main(String[] args)throws IOException{

        InputStream in = System.in ;

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        Main gugu = new Main();
        gugu.dan(n);

    }
}
