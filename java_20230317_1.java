import java.util.Scanner;
// 1로 만들기  1463번
public class java_20230317_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] memo = new int [n+1]; //0~n 까지 들어가야 해서 n+1


        for(int i = 2; i <= n ; i++){
            memo[i] = memo[i-1] + 1;

            if(i % 2 == 0 ){ // 2으로 나누어 떨어지는 경우
                // 위에서 만든 memo[i] 값과 2로 나누어서 얻은 최소연산횟수 memo[i / 2] +1 를 비교해서 둘 중 작은걸 넣는다.
                memo[i] = Math.min(memo[i], memo[i / 2] + 1);
            }

            if (i % 3 == 0) {  // 3으로 나누어 떨어지는 경우
                // 위에서 만든 memo[i] 값과 3으로 나누어서 얻은 최소연산횟수 memo[i / 3] +1 를 비교해서 둘 중 작은걸 넣는다.
                memo[i] = Math.min(memo[i], memo[i / 3] + 1);
            }

        }
        System.out.println(memo[n]);
    }
}
