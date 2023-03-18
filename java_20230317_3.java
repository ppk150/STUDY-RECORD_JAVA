import java.util.Scanner;
//1, 2, 3 더하기 9095번
public class java_20230317_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();
        int[] input =new int[T];

        int[] memo = new int[12];

        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        memo[4] = 7;



        for(int i = 0 ; i < T ; i++){ // 들어온 예 배열로 넣는다.

            input[i] = sc.nextInt();

        }

        for(int i =5 ; i < 12 ;i++){

            memo[i] = memo[i-1] +memo[i-2]+memo[i-3];

        }

        for(int i = 0 ; i < T; i++ ){

            System.out.println(memo[input[i]]);

        }



    }
}
