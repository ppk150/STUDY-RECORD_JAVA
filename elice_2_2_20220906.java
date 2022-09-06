import java.util.Arrays;
import java.util.Scanner;

public class elice_2_2_20220906 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        int[] result = new int[x];
        result[0] = 1; // 첫번째 초밥 먹음
        int count =0;
        int comp = x;
        int comp_count = 0;


        for(int i = 1 ; i < x ; i ++){
            count = sc.nextInt()+1;
            if(result[i-1] + count > x){
                //count = count - x; // x의 범위를 넘어가면 다시 돌아오게
                comp = result[i-1] + count - x;

                for(int j = 0 ; j < x ; j++){
                    if(result[j] ==comp){
                        comp_count++;
                        break;
                    }
                }

                if(comp_count!=0){
                    result[i] = Math.abs(result[i-1] + count - (2)*x);

                }else {
                    result[i] = result[i - 1] + count - x; // 7빼보고, 중복되면 한번 더 빼고 절대값 씌움
                }

            }else{
                result[i] = result[i-1] + count;
            }

        }

        for(int i = 0 ; i < x ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
