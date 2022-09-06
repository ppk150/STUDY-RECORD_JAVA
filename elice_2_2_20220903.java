import java.util.Arrays;
import java.util.Scanner;

public class elice_2_2_20220903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[][] Dal = new int[x][x];

        int end = 0;

        int count = 1;
        double count_dal = 0;
        double countfordal = 0;

        while (count <= x * x) {

            for (int i = (int) count_dal/2; i < x-count_dal/2 ; i++) {
                Dal[(int) (count_dal/2)][i] = count;
                count++;
            }
            countfordal++;
            if(countfordal % 2 !=0){
                count_dal++;
            }


            for (int i = (int) Math.round(count_dal/2); i < Math.round(x-count_dal/2); i++) {
                Dal[i][(int) (x - count_dal/2)] = count;
                count++;
            }
            countfordal++;
            if(countfordal % 2 !=0){
                count_dal++;
            }


        for (int i = (int) Math.round(count_dal/2); i < x-count_dal/2 ; i++) {
            Dal[(int) (x-count_dal/2)][x-i-1] = count;
            count++;
        }
            countfordal++;
            if(countfordal % 2 !=0){
                count_dal++;
            }

       for (int i = (int) Math.round(count_dal/2); i < x-count_dal/2 ; i++) {
            Dal[x-i-1][(int) (count_dal/2-1)] = count;
            count++;
        }
            countfordal++;
            if(countfordal % 2 !=0){
                count_dal++;
            }


    }


        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < x ; j++){
                if(j < x-1){
                    System.out.print(Dal[i][j] + " ");
                }else{
                    System.out.println(Dal[i][j] + " ");
                }

            }


        }


    }
}
