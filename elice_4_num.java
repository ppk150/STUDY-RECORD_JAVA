import java.util.Arrays;
import java.util.Scanner;

public class elice_4_num {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int[] A = new int[x+1];

        int result = 0;
        int resuntcount = 0;


        for(int i = 1 ; i <=x  ; i++){
            int count  = 0 ;

            for(int j = 1 ;j <=i ;j++ ){
                if(i%j == 0){
                    count++;
                }
            }
            A[i-1]=count;

        }
        for(int i = 0 ; i < x ; i++){
            if(result<=A[i]){
                result = A[i];
                resuntcount = i;
            }
        }
        System.out.println(resuntcount+1);

    }
}
