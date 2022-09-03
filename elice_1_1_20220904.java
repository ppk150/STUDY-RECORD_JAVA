import java.util.Scanner;

public class elice_1_1_20220904 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int count_x = 0 ;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ALL = new int[N*M];


        for (int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                ALL[count] = sc.nextInt();
                count++;
            }

        }
        x = sc.nextInt();

        for(int i = 0 ; i < N*M ; i++){
            if(ALL[i]==(x)){
                count_x++;
            }

        }
        System.out.println(count_x);
    }
}
