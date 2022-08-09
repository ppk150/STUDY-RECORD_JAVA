import java.io.*;

public class java_20220809_1_for {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String MM = bf.readLine();
        int money  = Integer.parseInt(MM); // M개의 카드
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT); // M개의 카드
        int sum = 0;

        for(int i = 0 ; i < T ; i++){
            String[] stuff = bf.readLine().split(" ");

            int cost = Integer.parseInt(stuff[0]);
            int count = Integer.parseInt(stuff[1]);

            sum = sum + (cost * count);

        }
        if (sum == money){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }
}
